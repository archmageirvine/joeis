package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A390368 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A390368 extends Sequence1 {

  private long[] mRow = new long[0];
  private int mM = 0;

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

  private boolean isHeapable(final int[] p, final int start) {
    final Node root = new Node(p[start]);
    for (int k = start + 1; k < p.length; ++k) {
      if (!insert(root, p[k])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[mRow.length + 1];
      mM = 0;
      final Permutation perm = new Permutation(mRow.length);
      int[] p;
      while ((p = perm.next()) != null) {
        for (int k = 0; k < p.length; ++k) {
          if (isHeapable(p, k)) {
            ++mRow[k];
            break;
          }
        }
      }
    }
    return Z.valueOf(mRow[mM]);
  }
}
