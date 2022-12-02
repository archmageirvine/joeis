package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A060589 a(n) = 2*(2^n-1)*3^(n-1).
 * @author Manfred Scheucher
 * @author Sean A. Irvine
 */
public class A060595 extends Sequence3 {

  private static final int ALLOWED_CHANGES = 1;
  private int mN = 2;
  private int[][][][] mX;
  private long mCnt = 0;

  boolean testValid(final int a, final int b, final int c, final int d) {
    int i, j, k, l, m;
    for (int e = 0; e < d; ++e) {
      if (e == a || e == b || e == c) {
        continue;
      }
      if (e < a) {
        i = e;
        j = a;
        k = b;
        l = c;
        m = d;
      } else {
        if (e < b) {
          i = a;
          j = e;
          k = b;
          l = c;
          m = d;
        } else {
          if (e < c) {
            i = a;
            j = b;
            k = e;
            l = c;
            m = d;
          } else // e<d since e is maximal element
          {
            i = a;
            j = b;
            k = c;
            l = e;
            m = d;
          }
        }
      }

      int s1 = mX[i][j][k][l];
      int s2 = mX[i][j][k][m];
      int s3 = mX[i][j][l][m];
      int s4 = mX[i][k][l][m];
      int s5 = mX[j][k][l][m];
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

  void display() {
    mCnt++;
//    printf("#%ld: ", cnt);
//    for (int a = 0; a < N; a++) {
//      for (int b = a + 1; b < N; b++) {
//        for (int c = b + 1; c < N; c++) {
//          for (int d = c + 1; d < N; d++) {
//            printf(X[a][b][c][d] > 0 ? "+" : "-");
//          }
//        }
//      }
//    }
//    printf("\n");
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
      display();
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

//  void rec_fill1(int a, int b, int c, int d) {
//    if (d == mN) {
//      c++;
//      d = c + 1;
//      if (d == mN) {
//        b++;
//        c = b + 1;
//        d = c + 1;
//        if (d == mN) {
//          a++;
//          b = a + 1;
//          c = b + 1;
//          d = c + 1;
//          if (d == mN) {
//            display();
//            return;
//          }
//        }
//      }
//    }
//
//    {
//      for (int v = -1; v <= 1; v += 2) {
//        mX[a][b][c][d] = v;
//        if (testValid(a, b, c, d)) {
//          rec_fill1(a, b, c, d + 1);
//        }
//        mX[a][b][c][d] = 0;
//      }
//    }
//  }

  @Override
  public Z next() {
    ++mN;
    mCnt = 0;
    mX = new int[mN][mN][mN][mN];
    recFill2(0, 1, 2, 3);
    return Z.valueOf(mCnt);
  }
}
