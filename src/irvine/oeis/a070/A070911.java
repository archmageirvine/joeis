package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence3;

/**
 * A070911 a(n) is twice the least possible area enclosed by a convex lattice n-gon.
 * @author Sean A. Irvine
 */
public class A070911 extends Sequence3 implements Conjectural {

  // See https://codegolf.stackexchange.com/questions/253633/the-smallest-area-of-a-convex-grid-polygon

  // todo this looks to be buggy for larger n -- problem also exists in C code, gets 79, 98, but then 120

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected int mN = 19; //2;
  private int mMinArea = 0;
  private int[] mSolnX;
  private int[] mSolnY;

  private boolean createPolygonJit(final int[] x, final int[] y, final int n, final int target, final int gridsize, int currArea) {
    assert currArea >= 0;
    if (n >= 3) {
      final int x1 = x[n - 3] - x[n - 2];
      final int y1 = y[n - 3] - y[n - 2];
      final int x2 = x[n - 1] - x[n - 2];
      final int y2 = y[n - 1] - y[n - 2];
      if (x1 * y2 - x2 * y1 <= 0) { // Angle > 180
        return false;
      }
      if (x1 * x2 + y1 * y2 > 0) { // Angle >= 90
        return false;
      }
      if (x[1] == 0 && x[n - 1] == 0) {
        return true;
      }
      final int addArea = x[n - 1] * y[n - 2] - y[n - 1] * x[n - 2];
      if (addArea <= 0) {
        return true;
      }
      currArea += addArea;
      if (currArea >= mMinArea) {
        return true;
      }
      if (n == target) {
        mMinArea = currArea;
        System.arraycopy(x, 0, mSolnX, 0, x.length);
        System.arraycopy(y, 0, mSolnY, 0, y.length);
        return true;
      }
      final int mini = Math.max(0, x[n - 1] - 3);
      final int maxi = Math.min(gridsize, x[n - 1] + 4);
      final int minj = Math.max(-gridsize / 2, y[n - 1] - 3);
      final int maxj = Math.min(gridsize / 2 + 1, y[n - 1] + 4);
      if (x2 > 0) {
        if (y2 > 0) {
          if (x2 > y2) {
            for (int j = minj; j < maxj; ++j) {
              for (int i = maxi - 1; i > mini - 1; --i) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (x[n] == maxi - 1) {
                break;
              }
            }
          } else {
            for (int j = maxj - 1; j > minj - 1; --j) {
              for (int i = maxi - 1; i > mini - 1; --i) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (x[n] == maxi - 1) {
                break;
              }
            }
          }
        } else {
          if (x2 > -y2) {
            for (int i = maxi - 1; i > mini - 1; --i) {
              for (int j = minj; j < maxj; ++j) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (y[n] == minj) {
                break;
              }
            }
          } else {
            for (int i = mini; i < maxi; ++i) {
              for (int j = minj; j < maxj; ++j) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (y[n] == minj) {
                break;
              }
            }
          }
        }
      } else {
        if (y2 > 0) {
          if (-x2 > y2) {
            for (int i = mini; i < maxi; ++i) {
              for (int j = maxj - 1; j > minj - 1; --j) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (y[n] == maxj - 1) {
                break;
              }
            }
          } else {
            for (int i = maxi - 1; i > mini - 1; --i) {
              for (int j = maxj - 1; j > minj - 1; --j) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (y[n] == maxj - 1) {
                break;
              }
            }
          }
        } else {
          if (-x2 > -y2) {
            for (int j = maxj - 1; j > minj - 1; --j) {
              for (int i = mini; i < maxi; ++i) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (x[n] == mini) {
                break;
              }
            }
          } else {
            for (int j = minj; j < maxj; ++j) {
              for (int i = mini; i < maxi; ++i) {
                x[n] = i;
                y[n] = j;
                if (!createPolygonJit(x, y, n + 1, target, gridsize, currArea)) {
                  break;
                }
              }
              if (x[n] == mini) {
                break;
              }
            }
          }
        }
      }
    } else {
      final int mini = Math.max(0, x[n - 1] - 3);
      final int maxi = Math.min(gridsize, x[n - 1] + 4);
      final int minj = Math.max(-gridsize / 2, y[n - 1] - 3);
      final int maxj = Math.min(gridsize / 2, y[n - 1] + 4);
      for (int i = mini; i < maxi; ++i) {
        for (int j = minj; j < maxj; ++j) {
          x[n] = i;
          y[n] = j;
          createPolygonJit(x, y, n + 1, target, gridsize, currArea);
        }
      }
    }
    x[n] = 0;
    y[n] = 0;
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final int[] x = new int[mN];
    final int[] y = new int[mN];

    final int gridSize = mN == 20 ? 40 : mN + 1; // heuristic!
    mMinArea = gridSize * gridSize;
    mSolnX = new int[mN];
    mSolnY = new int[mN];

    createPolygonJit(x, y, 1, mN, gridSize, 0);

    if (mVerbose) {
      for (int k = 0; k < mSolnX.length; ++k) {
        System.out.print("(" + mSolnX[k] + "," + mSolnY[k] + ")");
      }
      System.out.println();
    }
    return Z.valueOf(mMinArea);
  }
}
