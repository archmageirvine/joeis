package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001851 Total diameter of unlabeled trees with n nodes.
 * @author Gang Li
 * @author Frank Ruskey
 * @author W. Bomfin
 * @author Sean A. Irvine
 */
public class A001851 extends Sequence1 {

  // Based on freetree.c by Gang Li & Frank Ruskey.
  // Described in G. Li and F. Ruskey,  "The Advantages of Forward Thinking in
  // Generating Rooted and Free Trees",  10th Annual ACM-SIAM Symposium on
  // Discrete Algorithms (SODA), (1999) S939-940.
  // Adapted by W. Bomfin
  // Ported to Java by Sean A. Irvine

  private int mN = 0;
  private int mUpperBound;
  private int[] mParentPosition;
  private int[] mNumberOfChildren;
  private int[] mNextGoodPosition;
  private int[] mRightmostChild;
  private long mNumberTrees;
  private int mU;
  private int mK;

  private boolean good(final int p, final int h, final int t) {
    if (p == 2 && mK <= 2 && t == 0) {
      return true;
    }
    if (t == 1) {
      if (2 * h >= mK + 1 && 2 * h <= mU + 1) {
        if ((p - 1) * 2 >= mN) {
          return true;
        } else if (p - h - 1 == 1) {
          return mParentPosition[p] > 2;
        } else {
          return (p - h - 1 >= 2) && ((mParentPosition[h + 2] > 2) || (mParentPosition[h + 3] > 2));
        }
      }
    } else if (mN - p >= h && 2 * h >= mK) {
      if (mU == mN - 1 && (mN & 1) == 0) {
        return 2 * h <= mU + 1;
      } else {
        return 2 * h <= mU;
      }
    }
    return false;
  }

  private void generate(final int p, int s, int cL, int h, final int l, final int n, final int f, final int g) {
    if (p > n) {
      if (f == 0) {
        if (good(p - 1, h, 0)) {
          generate(p, 2, p - 2, h, n, mN, 1, 0);
        }
        if (good(p - 1, h, 1)) {
          generate(p, 2, p - 3, h, n, mN, 1, 1);
        }
      } else {
        ++mNumberTrees;
      }
    } else {
      if (cL == 0) {
        if (p < mUpperBound + 2) {
          mParentPosition[p] = p - 1;
        } else {
          generate(p, p - 1, 1, h, l, n, f, g);
          return;
        }
      } else {
        if (mParentPosition[p - cL] < s) {
          mParentPosition[p] = mParentPosition[p - cL];
        } else {
          mParentPosition[p] = cL + mParentPosition[p - cL];
          if (g == 1) {
            if ((l - 1) * 2 < n && p - cL <= l
                && ((p - cL + 1 < l && mParentPosition[p - cL + 1] == 2
                     && p - cL + 2 <= l && mParentPosition[p - cL + 2] == 2)
                    || (p - cL + 1 == l && mParentPosition[p - cL + 1] == 2)
                    || p - cL + 1 > l)) {
              s = mParentPosition[p];
              cL = p - s;
              mParentPosition[p] = mParentPosition[mParentPosition[p]];
            } else if (mParentPosition[p - cL] == 2) {
              mParentPosition[p] = 1;
            }
          }
        }
      }
      if (s != 0 || p <= mUpperBound + 1) {
        mNumberOfChildren[mParentPosition[p]]++;
        final int temp = mRightmostChild[mParentPosition[p]];
        mRightmostChild[mParentPosition[p]] = p;
        final int w = mParentPosition[p] == 1 ? mN - 1 : mN - 2;
        if (mNumberOfChildren[mParentPosition[p]] <= w) {
          if (mNumberOfChildren[mParentPosition[p]] < w) {
            mNextGoodPosition[p] = mParentPosition[p];
          } else {
            mNextGoodPosition[p] = mNextGoodPosition[mParentPosition[p]];
          }
          generate(p + 1, s, cL, h, l, n, f, g);
        }
        mNumberOfChildren[mParentPosition[p]]--;
        mRightmostChild[mParentPosition[p]] = temp;
      }
      if (s == 0 && 2 * (p - 2) < mK) {
        return;
      }
      mNextGoodPosition[p] = mNextGoodPosition[mParentPosition[p]];
      int entry = mNextGoodPosition[p];
      int flag = 0;
      int hh = 1;
      while (((f == 0 && entry >= 2) || (f == 1 && entry >= 1)) && flag == 0) {
        if (s == 0) {
          h = p - 2;
        }
        if (p <= l + h - g) {
          hh = 0;
        }
        if (f == 0 || hh == 1) {
          mParentPosition[p] = entry;
          mNumberOfChildren[entry]++;
          final int temp = mRightmostChild[mParentPosition[p]];
          mRightmostChild[mParentPosition[p]] = p;
          if (mNumberOfChildren[entry] >= (entry == 1 ? mN - 1 : mN - 2)) {
            mNextGoodPosition[p] = mNextGoodPosition[entry];
          }
          if (f == 0) {
            generate(p + 1, temp, p - temp, h, 0, mN - h + 1, f, g);
          } else if (hh == 1) {
            generate(p + 1, temp, p - temp, h, l, n, f, g);
          }
          mNumberOfChildren[entry]--;
          mRightmostChild[mParentPosition[p]] = temp;
          entry = mNextGoodPosition[entry];
          mNextGoodPosition[p] = entry;
        } else {
          flag = 1;
        }
      }
      if (f == 0) {
        if (good(p - 1, h, 0)) {
          generate(p, 2, p - 2, h, p - 1, mN, 1, 0);
        }
        if (good(p - 1, h, 1)) {
          generate(p, 2, p - 3, h, p - 1, mN, 1, 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.valueOf(mN - 1);
    }
    mParentPosition = new int[mN + 1];
    mNumberOfChildren = new int[mN + 1];
    mNextGoodPosition = new int[mN + 1];
    mRightmostChild = new int[mN + 1];
    Z res = Z.TWO;
    for (mK = 3; mK < mN - 1; ++mK) {
      mU = mK;
      mNumberTrees = 0;
      mUpperBound = (mU + 1) / 2;
      mParentPosition[1] = 0;
      mParentPosition[2] = 1;
      mNextGoodPosition[1] = 0;
      mNextGoodPosition[2] = 1;
      mNumberOfChildren[1] = 1;
      generate(3, 0, 0, mUpperBound, 0, mN - mUpperBound + 1, 0, 0);
      res = res.add(Z.valueOf(mNumberTrees).multiply(mK));
    }
    return res.add(mN - 1);
  }
}
