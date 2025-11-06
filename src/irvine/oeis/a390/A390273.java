package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.oeis.a336.A336282;

/**
 * A390273 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A390273 extends A336282 {

  /** Construct the sequence. */
  public A390273() {
    super(1);
  }

  private static final class Node {
    private final int mValue;
    private Node mLeft = null;
    private Node mRight = null;

    private Node(final int value) {
      mValue = value;
    }
  }

  private boolean insert(final Node root, final int value) {
    final LinkedList<Node> queue = new LinkedList<>();
    queue.add(root);
    Node bestCandidate = null;
    while (!queue.isEmpty()) {
      final Node node = queue.pollFirst();
      if (node.mValue < value) {
        if (node.mLeft == null || node.mRight == null) {
          if (bestCandidate == null || node.mValue > bestCandidate.mValue) {
            bestCandidate = node;
          }
        }
      }
      if (node.mLeft != null) {
        queue.add(node.mLeft);
      }
      if (node.mRight != null) {
        queue.add(node.mRight);
      }
    }
    if (bestCandidate != null) {
      if (bestCandidate.mLeft == null) {
        bestCandidate.mLeft = new Node(value);
      } else {
        bestCandidate.mRight = new Node(value);
      }
      return true;
    }
    return false;
  }

  private static int height(final Node node) {
    return node == null ? 0 : 1 + Math.max(height(node.mLeft), height(node.mRight));
  }

  @Override
  protected long count(final int[] p) {
    // We already know the p is heapable
    final Node root = new Node(p[0]);
    for (int k = 1; k < p.length; ++k) {
      if (!insert(root, p[k])) {
        throw new RuntimeException("Could not insert supposedly heapable permutation");
      }
    }
    return height(root);
  }
}
