package irvine.oeis.a027;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A27607.
 * @author Christopher Tubbs
 * @author Byron Heads
 * @author Lucas Holt
 * @author Andrew Timson
 * @author John Markus 
 * @author Sean A. Irvine (java port)
 */
public class A027607 implements Sequence {

  /* Hyperset Classification
   *
   * Summary: This program, when compiled with the flags
   *              gcc -std=c99 -DLEVEL=x HPC.c
   *          or by using the included Makefile, will attempt to
   *          determine the number of unique minimal hypersets
   *          within the set of all possible APGs of level x
   */


  //typedef byte graph_t;
  private static final byte ONE8 = 1;
  private static final int ONE32 = 1;
  private static final long ONE64 = 1;

  // thread-specific values passed from main
  private static final class Bounds {
    //pthread_t tid;
    long cmin;  // min candidate for a given LEVEL graph
    long cmax;  // max candidate for a given LEVEL graph
    long count;
  }

  private int mN = 0;

  // threads created by main() that do the actual work start here
  void doit(final Bounds bnd) {
    //bounds *bnd = (bounds *) arg;
    long candidate;      // binary str represents a square adjacency matrix
    long mask;           // binary mask
    int row;            // iterator
    long my_candidate, temp;
    byte[] graph = new byte[mN]; // graph represented as an array
    mask = (ONE64 << mN) - 1;    // mask of LEVEL number of ones to isolate rows

    candidate = bnd.cmin;
    while (true) {
      if (candidate > bnd.cmax) {
        break;
      }
      my_candidate = temp = candidate;

      candidate += mask + 1;

      // create graph from candidate
      for (row = 0; row < mN; ++row) {
        graph[mN - 1 - row] = (byte) (temp & mask);
        temp >>>= mN;
      }

      // check for all properties
      if (isApg(graph) && isMinimized(graph)
        && isUnique(graph, my_candidate)) {
        ++bnd.count;
      }
    }
  }

  // check to see if all nodes can be traversed.
// also filter out many candidates if sinks are found in places
// other than the last row.
// also filter for candidates that aren't traversed in the order
// their of their rows (throws out many duplicates, but not all)
  boolean isApg(final byte[] graph) {
    int visited = ONE32 << (mN - 1); // mark row 0 as visited

    int mask = ONE32 << (mN - 1); // start mask at column 0 (edge to root)

    // check all but last row
    for (int row = 0; row < (mN - 1); ++row) {
      // By the time each row is iterated to, it should have been
      // visited (as well as all rows before it), otherwise, even
      // if it's an APG, it's not a candidate, because I choose to
      // only allow candidates that are visited in order.

      // if this row has been visited and is not a sink
      if ((visited & mask) != 0 && graph[row] != 0) {
        visited |= graph[row]; // add this row's edges to visited list
      } else {
        return false;
      }
      mask >>>= 1;
    }

    // check if last row is visited (we ensure it is a sink in the main loop)
    if ((visited & mask) != 0) {
      int zeros = 0;
      // now check if zero before a 1, if so, this isn't a valid candidate
      mask = ONE8 << (mN - 2);
      while ((mask & ONE8) == 0) {
        if ((mask & graph[0]) != 0) {
          if (zeros != 0) {
            return false;
          }
        } else {
          ++zeros;
        }
        mask >>>= 1;
      }
      return true;
    }
    return false;
  }

  // attempt to minimize the graph
  private boolean isMinimized(final byte[] graph) {
    if (mN > 2) {
      int numPartitions = 2; // at least two partitions(sink and root)
      byte[] partitions = new byte[mN]; // room to separate all nodes
      byte sinkMask = 1;     // binary mask to check for edge to sink
      boolean modified;    // for checking if P(k)==P(k-1)

      byte mask = (byte) (ONE8 << (mN - 1));   // mask positioned under root

      // separate partitions that point to sink and those that don't
      partitions[0] = 1; // place sink in first partition
      for (int row = 0; row < mN - 1; ++row) {
        partitions[(sinkMask & graph[row]) != 0 ? 1 : 2] |= mask;
        mask >>>= 1;
      }
      if (partitions[2] != 0) {
        numPartitions = 3;
      }

      do {
        modified = false;
        int p = 1;
        while (p < numPartitions && numPartitions < mN) {
          // attempt to separate partition p
          separateP(graph, partitions, p, numPartitions);
          if (partitions[numPartitions] != 0) {
            ++numPartitions;
            modified = true; // partitions have changed
          }
          ++p;
        }
      }
      while (modified); // repeat while P(k) != P(k-1)

      // by now, all partitions are as separate as possible
      return numPartitions == mN;
    }
    return true;
  }

  // helper function for splitting up a single partition
  private void separateP(final byte[] graph, final byte[] partitions, final int p, final int numPartitions) {
    int a = 0;           // index of two nodes we are comparing
    int mask = 1 << (mN - 1); // binary mask for locating nodes, position a mask to bit for row 0

    // find the first node in this partition
    while (mask > 2) { // don't bother with sink or if only 1 non-sink
      if ((partitions[p] & mask) != 0) {
        break;
      }
      ++a;
      mask >>>= 1;
    }
    if (mask < 4) {
      return; // partition empty or only contains sink
    }

    // check next potential
    int b = (a + 1);  // todo promote to ints?
    mask >>>= 1;

    byte separated = 0;      // remember nodes that separate from 'a'
    while (mask > 1) // second node won't be the sink
    {
      if ((partitions[p] & mask) != 0) { // found a second node to compare with 'a'
        if (canSeparate(graph, a, b, partitions, numPartitions) ||
          canSeparate(graph, b, a, partitions, numPartitions)) {
          separated |= mask;
        }
      }
      ++b;
      mask >>>= 1;
    }

    partitions[numPartitions] = separated;// place separated nodes in new partition
    partitions[p] ^= separated; // remove separated nodes from this partition
  }

  // check if two nodes in partition can separate
  private boolean canSeparate(final byte[] graph, final int a, final int b, final byte[] partitions, final int numPartitions) {
    int mask = 1 << (mN - 1); // position mask under first potential child
    //foreach child of a, b has a child in the same partition
    while (mask != 0) {
      //if child in a exists, and it doesn't exists in b
      if ((graph[a] & mask) != 0 && (graph[b] & mask) == 0) { //child exists in a but not b
        for (int p = 0; p < numPartitions; ++p) {
          // if a's child is in partition[p]
          if ((partitions[p] & mask) != 0) { // are any child of b in partition[p]?
            if ((partitions[p] & graph[b]) != 0) {
              break;
            }
            return true;
          }
        }
      }
      mask >>>= 1;
    }
    return false;
  }

  // check for uniqueness by determining if this graph has duplicates
  // through row swapping. Only count if this decoration
  // has the highest value of all possible duplicates
  private boolean isUnique(final byte[] graph, final long orig) {
    if (mN > 3) {
      final byte[] indexes = new byte[mN]; // array holds current permute of middle row indexes

      // create copy of graph to determine equivalent permutations
      final byte[] equivGraph = Arrays.copyOf(graph, mN);

      // create initial permutation of {1,2,3,...,mN-2}
      for (int k = 0; k < mN; ++k) {
        indexes[k] = (byte) k;
      }

      long perm;
      while ((perm = nextPermutation(equivGraph, indexes)) != 0) {
        if (perm > orig) {
          return false;
        }
      }
    }
    return true;
  }

  // find next permutation of middle (LEVEL-2) rows from previous
  // Use lexicographical ordering of an array containing the
  // indexes for the main row (their original decoration)
  // Every time we swap to create the next lexicographical permutation,
  // we also swap the corresponding rows and columns in the graph
  //
  // Adapted from Kenneth Rosen's Discrete Mathematics and its Applications,
  //  6th edition, p.384, Algorithm 1: Generating the Next Permutation
  //  in Lexicographic Order
  private long nextPermutation(final byte[] graph, final byte[] indexes) {
    int k = mN - 3;
    while (indexes[k] > indexes[k + 1]) {
      --k;
    }
    if (k == 0) {
      return (0);
    } else {
      int j = mN - 2;
      while (indexes[k] > indexes[j]) {
        --j;
      }
      swapRowCol(graph, indexes, j, k);
      int r = mN - 2;
      int s = k + 1;
      while (r > s) {
        swapRowCol(graph, indexes, r, s);
        --r;
        ++s;
      }
    }
    // compare values
    return graph2int(graph);
  }

  // swap a single row and column, and the indexes that refer to them
// for use with next_permutation()
  void swapRowCol(final byte[] graph, final byte[] indexes, final int x, final int y) {
    // swap indexes
    indexes[x] ^= indexes[y];
    indexes[y] ^= indexes[x];
    indexes[x] ^= indexes[y];

    // swap rows first
    graph[x] ^= graph[y];
    graph[y] ^= graph[x];
    graph[x] ^= graph[y];

    // swap columns x,y for i=0, i<LEVEL
    final int b1 = ONE8 << (mN - 1 - x);
    final int b2 = ONE8 << (mN - 1 - y);

    for (int r = 0; r < mN; ++r) {
      // swap bits only if they are different
      // if they are different, the swap doesn't
      // need to know what they are: just that they
      // need to be flipped
      if (((graph[r] & b1) != 0 ? 1 : 0) != ((graph[r] & b2) != 0 ? 1 : 0)) {
        graph[r] ^= (b1 | b2);
      }
    }
  }

  // create integer from graph
  long graph2int(byte[] graph) {
    long value = 0;
    int i;
    for (i = 0; i < mN; ++i) {
      value <<= mN;
      value |= graph[i];
    }
    return value;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    long cmin = ONE64 << (mN * mN - 2); // min candidate for a given LEVEL graph
    long cmax = (ONE64 << (mN * mN)) - 1; // max candidate for a given LEVEL graph

    int nBounds = 2;
    Bounds[] boundsArray = new Bounds[nBounds];
    for (int k = 0; k < boundsArray.length; ++k) {
      boundsArray[k] = new Bounds();
    }

    Bounds b1 = boundsArray[0];
    Bounds b2 = boundsArray[1];

    b1.count = 0;
    b1.cmin = cmin;
    // because we filter out "chunks" of candidates who don't end in a sink,
    // we need to make sure that b1's max, and b2's min are not in the middle
    // of a "chunk"
    b1.cmax = ((((cmax - cmin) / 2)+cmin) & ~((ONE64 << mN) - 1))-1;

    b2.count = 0;
    b2.cmin = b1.cmax + 1;
    b2.cmax = cmax;

// #ifdef SECTION
//     printf("Profiling section %i (MIN: %lu, MAX: %lu)of level %i...\n", SECTION,CMIN,CMAX,LEVEL);
// #else
//     printf("Profiling level %i ...\n",LEVEL);
// #endif
//    pthread_create( & b1.tid, null, &doit, &b1 );
//    pthread_create( & b2.tid, null, &doit, &b2 );
//
//    pthread_join(b1.tid, null);
//    pthread_join(b2.tid, null);
    doit(b1);
    doit(b2);

    long total_count = b1.count + b2.count;
    //printf("\nLevel %i has %lu\n", LEVEL, total_count);

    // todo -- increment level
    return Z.valueOf(total_count);
  }
}
