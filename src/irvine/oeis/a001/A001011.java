package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001011 Number of ways to fold a strip of n blank stamps.
 * @author Joe Sawada
 * @author Sean A. Irvine (Java port)
 */
public class A001011 implements Sequence {

  // This implementation is based on stamp.c which carried the following header:
  // http://www.cis.uoguelph.ca/~sawada/prog/stamp.c

  //------------------------------------------------------
  // STAMP FOLDINGS, SEMI-MEANDERS, OPEN MEANDERS
  // Research by:   Joe Sawada, Roy Li
  // Programmed by: Joe Sawada 2008
  //------------------------------------------------------
  private static final int NULL = -1;

  private static class List {
    private int mHead = NULL;
    private int mTail = NULL;
  }

  private static class Interval {
    private int mLeft;
    private int mRight;
    private int mPrev;
    private int mNext;
    private int mNodePtr;
    private int mNextPerm;
    private int mPrevPerm;
  }

  private static class Node {
    final List mLeft = new List();
    final List mRight = new List();
    int mUpInterval = NULL;
    int mUpSide = '-';
  }

  private final List mPerm = new List();
  private Node[] mNode;
  private Interval[] mInterval;
  private long mTotal = 0;

  /*
  if (type == 1) MEANDER = 1;       // SLOANE A005316
  if (type == 2) SEMI = 1;        // SLOANE A000682
  if (type == 3) STAMP = 1;       // SLOANE A000136
  if (type == 4) UNLABELED = MEANDER = 1; // SLOANE A077055
  if (type == 5) SYM_SEMI = 1;      // SLOANE A000560
  if (type == 6) UNLABELED = STAMP = 1; // SLOANE A001011
  */

  private int mN = 0;

  // This array is only used in print. It here to avoid churn.
  private int[] mWorkspace;

  private void print() {
    int j = 0;
    boolean one = false;
    int i = mPerm.mHead;
    while (i != NULL) {
      mWorkspace[++j] = mInterval[i].mRight;
      if (mWorkspace[j] == 1) {
        one = true;
      } else if (mWorkspace[j] == mN && !one) {
        return;
      }
      i = mInterval[i].mNextPerm;
    }
    for (j = 1; j <= mN; ++j) {
      if (mWorkspace[j] < mN - mWorkspace[mN - j + 1] + 1) {
        break;
      }
      if (mWorkspace[j] > mN - mWorkspace[mN - j + 1] + 1) {
        return;
      }
    }
    ++mTotal;
  }

  private void insertInterval(final List list, final int t, final int left, final int right, final int p, final int n, final int nodePtr) {
    if (p != NULL) {
      mInterval[p].mNext = t;
    } else {
      list.mHead = t;
    }

    if (n != NULL) {
      mInterval[n].mPrev = t;
    } else {
      list.mTail = t;
    }

    mInterval[t].mLeft = left;
    mInterval[t].mRight = right;
    mInterval[t].mPrev = p;
    mInterval[t].mNext = n;
    mInterval[t].mNodePtr = nodePtr;
  }

  private void removeInterval(final List list, final int t) {
    if (mInterval[t].mNext == NULL) {
      list.mTail = mInterval[t].mPrev;
    } else {
      mInterval[mInterval[t].mNext].mPrev = NULL;
    }
    if (mInterval[t].mPrev == NULL) {
      list.mHead = mInterval[t].mNext;
    } else {
      mInterval[mInterval[t].mPrev].mNext = NULL;
    }
  }

  private void moveInterval(final int t, final List list1, final List list2, final int p, final int n, final int nodePtr) {
    removeInterval(list1, t);
    insertInterval(list2, t, mInterval[t].mLeft, mInterval[t].mRight, p, n, nodePtr);
  }

  private void setNode(final int t, final int upInterval, final int upSide) {
    mNode[t].mUpInterval = upInterval;
    mNode[t].mUpSide = upSide;
  }

  private void setNodeLists(final int t, int leftHead, int leftTail, int rightHead, int rightTail) {
    if (leftHead == NULL || leftTail == NULL) {
      leftHead = NULL;
      leftTail = NULL;
    }
    if (rightHead == NULL || rightTail == NULL) {
      rightHead = NULL;
      rightTail = NULL;
    }
    mNode[t].mLeft.mHead = leftHead;
    mNode[t].mLeft.mTail = leftTail;
    mNode[t].mRight.mHead = rightHead;
    mNode[t].mRight.mTail = rightTail;
  }

  private void updatePerm(final int t, final int i) {
    final int p = mInterval[i].mPrevPerm;
    final int n = mInterval[i].mNextPerm;
    mInterval[2 * t - 1].mPrevPerm = p;
    mInterval[2 * t - 1].mNextPerm = 2 * t;
    mInterval[2 * t].mPrevPerm = 2 * t - 1;
    mInterval[2 * t].mNextPerm = n;
    if (p != NULL) {
      mInterval[p].mNextPerm = 2 * t - 1;
    } else {
      mPerm.mHead = 2 * t - 1;
    }
    if (n != NULL) {
      mInterval[n].mPrevPerm = 2 * t;
    }
  }

  private void restorePerm(final int i) {
    final int p = mInterval[i].mPrevPerm;
    final int n = mInterval[i].mNextPerm;
    if (p != NULL) {
      mInterval[p].mNextPerm = i;
    } else {
      mPerm.mHead = i;
    }
    if (n != NULL) {
      mInterval[n].mPrevPerm = i;
    }
  }

  private void generate(final int t, final Node x, final int depth) {
    if (t > mN) {
      print();
    } else {
      // Visit left list, then right lis
      for (int side = 1; side <= 2; ++side) {
        final boolean mIsSymSemi = false;
        if (mIsSymSemi && t == 2 && side == 2) {
          return;
        }
        int up = 0;
        int i = side == 1 ? x.mLeft.mHead : x.mRight.mHead;

        // Optimization for meanders
        final boolean mIsMeander = false;
        if (mIsMeander && mN - t <= depth) {
          i = x.mUpInterval;
          if (x.mUpSide == 'l') {
            side = 1;
          } else {
            side = 2;
          }
        }
        // Visit all intervals in lis
        while (i != NULL) {
          final int n = mInterval[i].mNext;
          final int p = mInterval[i].mPrev;
          final int j = mInterval[i].mNodePtr;
          final Node y = mNode[j];
          final int oldUpInterval = y.mUpInterval;
          final int oldUpSide = y.mUpSide;

          setNode(2 * t - 1, NULL, NULL);
          setNode(2 * t, NULL, NULL);

          // Update next node and create 2 new nodes
          final boolean mIsStamp = true;
          final boolean mIsSemi = false;
          if (side == 1) {
            if (mIsStamp && depth == 0 && i == x.mLeft.mHead) {
              up = 1;
              if (y.mLeft.mHead != NULL) {
                setNodeLists(j, NULL, NULL, y.mLeft.mHead, y.mLeft.mTail);
              }
              moveInterval(x.mRight.mTail, x.mRight, y.mRight, y.mRight.mTail, NULL, 2 * t - 1);
            } else if (x.mUpInterval == i) {
              up = 1;
              if ((mIsMeander || mIsSemi) && depth == 0) {
                setNode(j, 2 * t - 1, 'l');
              }
            } else if (up == 1 || x.mUpSide == 'r') {
              setNode(j, 2 * t - 1, 'l');
              setNode(2 * t - 1, x.mUpInterval, x.mUpSide);
            } else {
              setNode(j, 2 * t, 'r');
              setNode(2 * t, x.mUpInterval, 'r');
            }
            setNodeLists(2 * t - 1, x.mLeft.mHead, p, x.mRight.mHead, x.mRight.mTail);
            setNodeLists(2 * t, NULL, NULL, n, x.mLeft.mTail);
          } else {
            if (mIsStamp && depth == 0 && i == x.mRight.mTail) {
              up = 1;
              if (y.mRight.mHead != NULL) {
                setNodeLists(j, y.mRight.mHead, y.mRight.mTail, NULL, NULL);
              }
              moveInterval(x.mLeft.mHead, x.mLeft, y.mLeft, NULL, y.mLeft.mHead, 2 * t);
            } else if (x.mUpInterval == i)  {
              up = 1;
              if ((mIsMeander || mIsSemi) && depth == 0) {
                setNode(j, 2 * t, 'r');
              }
            } else if (up == 1) {
              setNode(j, 2 * t - 1, 'l');
              setNode(2 * t - 1, x.mUpInterval, 'l');
            } else {
              setNode(j, 2 * t, 'r');
              setNode(2 * t, x.mUpInterval, x.mUpSide);
            }
            setNodeLists(2 * t - 1, x.mRight.mHead, p, NULL, NULL);
            setNodeLists(2 * t, x.mLeft.mHead, x.mLeft.mTail, n, x.mRight.mTail);
          }

          // Insert new intervals
          insertInterval(y.mLeft, 2 * t - 1, mInterval[i].mLeft, t, y.mLeft.mTail, NULL, 2 * t - 1);
          insertInterval(y.mRight, 2 * t, t, mInterval[i].mRight, NULL, y.mRight.mHead, 2 * t);
          // Remove current interval
          if (n != NULL) {
            mInterval[n].mPrev = NULL;
          }
          if (p != NULL) {
            mInterval[p].mNext = NULL;
          }
          // Update the permutation
          updatePerm(t, i);

          // Make recursive calls
          if (mIsStamp && depth == 0 && (i == x.mRight.mTail || i == x.mLeft.mHead)) {
            generate(t + 1, y, 0);
          } else if (x.mUpInterval == i) {
            generate(t + 1, y, Math.max(0, depth - 1));
          } else {
            generate(t + 1, y, depth + 1);
          }
          // Restore data structures
          restorePerm(i);

          if (n != NULL) {
            mInterval[n].mPrev = i;
          }
          if (p != NULL) {
            mInterval[p].mNext = i;
          }
          removeInterval(y.mLeft, 2 * t - 1);
          removeInterval(y.mRight, 2 * t);

          setNode(j, oldUpInterval, oldUpSide);
          if (mIsStamp && depth == 0) {
            if (i == x.mLeft.mHead) {
              moveInterval(y.mRight.mTail, y.mRight, x.mRight, x.mRight.mTail, NULL, j);
            }
            if (i == x.mRight.mTail) {
              moveInterval(y.mLeft.mHead, y.mLeft, x.mLeft, NULL, x.mLeft.mHead, j);
            }
          }
          i = n; // Next interval
          if (mIsMeander && mN - t <= depth) {
            return;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mTotal = 0;
    mNode = new Node[2 * mN + 1];
    for (int i = 0; i <= 2 * mN; ++i) {
      mNode[i] = new Node();
    }

    mInterval = new Interval[2 * mN + 1];
    for (int k = 0; k < mInterval.length; ++k) {
      mInterval[k] = new Interval();
    }
    mWorkspace = new int[mInterval.length];

    setNode(0, 2, 'r');
    insertInterval(mNode[0].mLeft, 1, 0, 1, NULL, NULL, 2);
    insertInterval(mNode[0].mRight, 2, 1, mInterval.length - 1, NULL, NULL, 1);

    mPerm.mHead = 1;
    mInterval[1].mPrevPerm = NULL;
    mInterval[1].mNextPerm = 2;
    mInterval[2].mPrevPerm = 1;
    mInterval[2].mNextPerm = NULL;
    generate(2, mNode[0], 0);
    return Z.valueOf(mTotal);
  }
}
