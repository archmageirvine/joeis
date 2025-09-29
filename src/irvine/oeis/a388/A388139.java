package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Permutation;

/**
 * A388139 Total number of fixed points in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A388139 extends AbstractSequence {

  // Explicit object based heap creation
//  private static final class TreeNode {
//    private final int mValue;
//    private TreeNode mLeft = null;
//    private TreeNode mRight = null;
//
//    private TreeNode(final int value) {
//      mValue = value;
//    }
//
//    private boolean insert(final int value) {
//      final LinkedList<TreeNode> queue = new LinkedList<>();
//      queue.add(this);
//      TreeNode bestCandidate = null;
//      while (!queue.isEmpty()) {
//        final TreeNode node = queue.pollFirst();
//        if (node.mValue < value) {
//          if (node.mLeft == null || node.mRight == null) {
//            if (bestCandidate == null || node.mValue > bestCandidate.mValue) {
//              bestCandidate = node;
//            }
//          }
//        }
//        if (node.mLeft != null) {
//          queue.add(node.mLeft);
//        }
//        if (node.mRight != null) {
//          queue.add(node.mRight);
//        }
//      }
//      if (bestCandidate != null) {
//        if (bestCandidate.mLeft == null) {
//          bestCandidate.mLeft = new TreeNode(value);
//        } else /*if (bestCandidate.mRight == null)*/ {
//          bestCandidate.mRight = new TreeNode(value);
//        }
//        return true;
//      }
//      return false;
//    }
//  }
//
//  private boolean isHeapable(final int[] p, final int m) {
//    final TreeNode root = new TreeNode(p[0]);
//    for (int k = 1; k < m; ++k) {
//      if (!root.insert(p[k])) {
//        return false;
//      }
//    }
//    return true;
//  }

  private int mN;
  private long mCount = 0;
  private int[] mP;

  protected A388139(final int offset) {
    super(offset);
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A388139() {
    this(1);
  }

  // Cf. https://oeis.org/A336282
  // Shifted by 1, so that the -1 of the python is 0 here
  private boolean isHeapable(final int[] p, final int m) {
    final int[] sig = new int[mN + 1];
    sig[1] = 2;
    for (int k = 1; k < m; ++k) {
      int j = p[k] + 1;
      sig[j] = 2;
      while (j > 0) {
        --j;
        if (sig[j] > 0) {
          --sig[j];
          break;
        }
      }
      if (j <= 0) {
        return false;
      }
    }
    return true;
  }

  // Incrementally build the permutation checking heapable property as we go
  // This is still rebuilding the heap for each element added to the partial
  // pemutation, but in principle we could unwind the addition at each stage.
  private void search(final int pos, final long used) {
    if (pos == mP.length) {
      mCount += contribution(mP);
      return;
    }
    for (int k = 0; k < mN; ++k) {
      if ((used & (1L << k)) == 0) {
        mP[pos] = k;
        if (isHeapable(mP, pos + 1)) {
          search(pos + 1, used | (1L << k));
        }
      }
    }
  }

  protected long contribution(final int[] p) {
    return Permutation.fixedPoints(p);
  }

  @Override
  public Z next() {
    mP = new int[++mN];
    mCount = 0;
    search(0, 0);
    return Z.valueOf(mCount);
  }
}
