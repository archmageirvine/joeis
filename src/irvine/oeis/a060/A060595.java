package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A060589.
 * @author Manfred Scheucher
 * @author Sean A. Irvine
 */
public class A060595 extends Sequence3 {

  private static final int ALLOWED_CHANGES = 1;
  private int mN = 2;
  private int[][][][] mX;
  private long mCnt = 0;

  boolean testValid(final int a, final int b, final int c, final int d) {
    for (int e = 0; e < d; ++e) {
      if (e == a || e == b || e == c) {
        continue;
      }
      final int i, j, k, l, m;
      if (e < a) {
        i = e;
        j = a;
        k = b;
        l = c;
        m = d;
      } else if (e < b) {
        i = a;
        j = e;
        k = b;
        l = c;
        m = d;
      } else if (e < c) {
        i = a;
        j = b;
        k = e;
        l = c;
        m = d;
      } else {
        // e<d since e is maximal element
        i = a;
        j = b;
        k = c;
        l = e;
        m = d;
      }

      final int s1 = mX[i][j][k][l];
      final int s2 = mX[i][j][k][m];
      final int s3 = mX[i][j][l][m];
      final int s4 = mX[i][k][l][m];
      final int s5 = mX[j][k][l][m];
      if (s1 == 0 || s2 == 0 || s3 == 0 || s4 == 0 || s5 == 0) {
        continue;
      }

      int changes = 0;
      if (s1 * s2 < 0) {
        ++changes;
      }
      if (s2 * s3 < 0) {
        ++changes;
      }
      if (s3 * s4 < 0) {
        ++changes;
      }
      if (s4 * s5 < 0) {
        ++changes;
      }
      if (changes > ALLOWED_CHANGES) {
        return false;
      }
    }
    return true;
  }

  void recFill2(int a, int b, int c, int d) {
    if (a == b) {
      a = 0;
      ++b;
      if (b == c) {
        b = 1;
        ++c;
        if (c == d) {
          c = 2;
          ++d;
        }
      }
    }
    if (d == mN) {
      ++mCnt;
    } else {
      for (int v = -1; v <= 1; v += 2) {
        mX[a][b][c][d] = v;
        if (testValid(a, b, c, d)) {
          recFill2(a + 1, b, c, d);
        }
        mX[a][b][c][d] = 0;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCnt = 0;
    mX = new int[mN][mN][mN][mN];
    recFill2(0, 1, 2, 3);
    return Z.valueOf(mCnt);
  }
}
