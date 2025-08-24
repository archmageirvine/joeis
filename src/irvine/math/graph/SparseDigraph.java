package irvine.math.graph;

import java.util.LinkedList;

import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * Implementation suitable for a sparsely connected digraph.
 * @author Sean A. Irvine
 */
public class SparseDigraph extends AbstractGraph {

  // Cf. Sparse graph

  // The easiest way to implement a sparse graph, would be to simply use
  // HashMap<Integer, Set<Integer>> to contain all the adjacencies.
  // However, that is quite costly in terms of object allocation.
  // Here we use dynamic arrays to combat that cost, at the expense of
  // really sparse graphs taking more space than they would otherwise.
  // Deleting edges will leave holes in the data structure that are never
  // reclaimed.

  // Actual destinations of edges are stored in the following array.  The
  // mNextEdge array points to the next slot used for edges from the same
  // starting vertex, or 0 if there are no more neighbours. Slot 0 is unused.
  private final LongDynamicIntArray mNeighbour = new LongDynamicIntArray();
  private final LongDynamicLongArray mNextNeighbour = new LongDynamicLongArray();

  // Pointer to the slot containing the first neighbour of a vertex, or 0.
  private final DynamicLongArray mFirstNeighbour = new DynamicLongArray();

  private long mNextFreeSlot = 1;
  private long mDeletedEdges = 0; // counts holes in the data structure
  private int mOrder;

  SparseDigraph(final int order) {
    mOrder = order;
  }

  @Override
  public int order() {
    return mOrder;
  }

  @Override
  public int size() {
    // todo this might be bogus in the presence of loops
    // Note this could overflow for very large graphs
    return (int) ((mNextFreeSlot - 1 - mDeletedEdges) / 2);
  }

  @Override
  public boolean isAdjacent(final int v1, final int v2) {
    if (v1 >= mOrder || v2 >= mOrder) {
      return false;
    }
    long slot = mFirstNeighbour.get(v1);
    while (slot != 0) {
      if (mNeighbour.get(slot) == v2) {
        return true;
      }
      slot = mNextNeighbour.get(slot);
    }
    return false;
  }

  private boolean addDirectedEdge(final int v1, final int v2) {
    long slot = mFirstNeighbour.get(v1);
    if (slot == 0) {
      // special case of the first edge for v1
      mFirstNeighbour.set(v1, mNextFreeSlot);
      mNeighbour.set(mNextFreeSlot, v2);
      ++mNextFreeSlot;
      return true;
    }
    long prevSlot;
    do {
      if (mNeighbour.get(slot) == v2) {
        return false; // Edge already present
      }
      prevSlot = slot;
      slot = mNextNeighbour.get(slot);
    } while (slot != 0);
    mNextNeighbour.set(prevSlot, mNextFreeSlot);
    mNeighbour.set(mNextFreeSlot, v2);
    ++mNextFreeSlot;
    return true;
  }

  @Override
  public void addEdge(final int v1, final int v2) {
    mOrder = Math.max(mOrder, Math.max(v1, v2) + 1);
    addDirectedEdge(v1, v2);
  }

  private void removeEdgeDirected(final int v1, final int v2) {
    // Safe to call this with non-existent edge
    long slot = mFirstNeighbour.get(v1);
    if (slot != 0) {
      if (mNeighbour.get(slot) == v2) {
        // Special case of first neighbour
        mFirstNeighbour.set(v1, mNextNeighbour.get(slot));
        ++mDeletedEdges;
        return;
      }
      long prevSlot;
      while (true) {
        prevSlot = slot;
        slot = mNextNeighbour.get(slot);
        if (slot == 0) {
          return;
        }
        if (mNeighbour.get(slot) == v2) {
          // Found it
          mNextNeighbour.set(prevSlot, mNextNeighbour.get(slot));
          ++mDeletedEdges;
          return;
        }
      }
    }
  }

  @Override
  public void removeEdge(final int v1, final int v2) {
    removeEdgeDirected(v1, v2);
  }

  @Override
  public int nextVertex(final int v1, final int v2) {
    // This is not particular efficient in this implementation
    int res = Integer.MAX_VALUE;
    long slot = mFirstNeighbour.get(v1);
    while (slot != 0) {
      final int u = mNeighbour.get(slot);
      if (u > v2) {
        res = Math.min(res, u);
      }
      slot = mNextNeighbour.get(slot);
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }

  @Override
  public boolean isConnected() {
    if (mOrder <= 1) {
      return true; // Trivially connected
    }
    // Quick check for isolated vertices
    for (int k = 0; k < mOrder; ++k) {
      if (mFirstNeighbour.get(k) == 0) {
        return false;
      }
    }
    final boolean[] seen = new boolean[mOrder];
    int seenCount = 0;
    final LinkedList<Integer> lst = new LinkedList<>();
    lst.add(0);
    while (!lst.isEmpty()) {
      final int v = lst.pollFirst();
      long slot = mFirstNeighbour.get(v);
      while (slot != 0) {
        final int u = mNeighbour.get(slot);
        if (!seen[u]) {
          lst.add(u);
          seen[u] = true;
          ++seenCount;
        }
        slot = mNextNeighbour.get(slot);
      }
    }
    return seenCount == mOrder;
  }

  private int findNext(final boolean[] visited, final int v) {
    long slot = mFirstNeighbour.get(v);
    while (slot != 0) {
      final int u = mNeighbour.get(slot);
      if (!visited[u]) {
        return u;
      }
      slot = mNextNeighbour.get(slot);
    }
    return -1;
  }

  @Override
  public boolean isBiconnected() {
    // Possibly the same implementation of SparseGraph would work here
    throw new UnsupportedOperationException();
  }

  @Override
  public long degree(final int v) {
    long degree = 0;
    if (v < mOrder) {
      long slot = mFirstNeighbour.get(v);
      while (slot != 0) {
        ++degree;
        slot = mNextNeighbour.get(slot);
      }
    }
    return degree;
  }

  @Override
  public Graph complement() {
    // This is not really very sensible for a large sparse graph, but at least
    // it will use a dense representation for small orders.
    final Graph res = GraphFactory.create(mOrder);
    for (int v = 0; v < mOrder; ++v) {
      for (int u = v; u < mOrder; ++u) {
        if (!isAdjacent(v, u)) {
          res.addEdge(v, u);
        }
      }
    }
    return res;
  }

  @Override
  public Graph copy(final int newOrder) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Graph delete(final int v) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isCyclic() {
    throw new UnsupportedOperationException();
  }
}
