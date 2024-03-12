package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068744 Number of potential flows in 3 X 3 array with integer velocities in -n..n, i.e., number of 3 X 3 arrays with adjacent elements differing by no more than n, counting arrays differing by a constant only once.
 * @author Sean A. Irvine
 */
public class A068744 extends Sequence0 {

  private int mN = -1;

  // Following 2x2 version does reproduce A063496
//  @Override
//  public Z next() {
//    ++mN;
//    // ab
//    // cd
//    long count = 0;
//    for (int a = -mN; a <= mN; ++a) {
//      for (int b = Math.max(-mN, a - mN); b <= Math.min(mN, a + mN); ++b) {
//        for (int c = Math.max(-mN, a - mN); c <= Math.min(mN, a + mN); ++c) {
//          for (int d = Math.max(Math.max(-mN, b - mN), c - mN); d <= Math.min(Math.min(mN, b + mN), c + mN); ++d) {
//            if (a == mN || b == mN || c == mN || d == mN) {
////              System.out.println(mN + " [" + a + "," + b + "," + c + "," + d + "]");
//              ++count;
//            }
//          }
//        }
//      }
//    }
//    return Z.valueOf(count);
//  }

  // todo rather than -n..n can we do 0..2n instead?
  // todo would it be better to pick e first

//  @Override
//  public Z next() {
//    ++mN;
//    // abc
//    // def
//    // ghi
//    long count = 0;
//    for (int a = -mN; a <= mN; ++a) {
//      for (int b = Math.max(-mN, a - mN); b <= Math.min(mN, a + mN); ++b) {
//        for (int c = Math.max(-mN, b - mN); c <= Math.min(mN, b + mN); ++c) {
//          for (int d = Math.max(-mN, a - mN); d <= Math.min(mN, a + mN); ++d) {
//            for (int e = Math.max(Math.max(-mN, b - mN), d - mN); e <= Math.min(Math.min(mN, b + mN), d + mN); ++e) {
//              for (int f = Math.max(Math.max(-mN, c - mN), e - mN); f <= Math.min(Math.min(mN, c + mN), e + mN); ++f) {
//                for (int g = Math.max(-mN, d - mN); g <= Math.min(mN, d + mN); ++g) {
//                  for (int h = Math.max(Math.max(-mN, e - mN), g - mN); h <= Math.min(Math.min(mN, e + mN), g + mN); ++h) {
//                    for (int i = Math.max(Math.max(-mN, f - mN), h - mN); i <= Math.min(Math.min(mN, f + mN), h + mN); ++i) {
//                      if (a == mN || b == mN || c == mN || d == mN || e == mN || f == mN || g == mN || h == mN || i == mN) {
//                        System.out.println(mN + " [" + a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + "," + h + "," + i + "]");
//                        ++count;
//                      }
//                    }
//                  }
//                }
//              }
//            }
//          }
//        }
//      }
//    }
//    return Z.valueOf(count);
//  }

  @Override
  public Z next() {
    ++mN;
    // abc
    // def
    // ghi
    long count = 0;
    for (int ab = -mN; ab <= mN; ++ab) {
      for (int be = -mN; be <= mN; ++be) {
        for (int de = -mN; de <= mN; ++de) {
          final int ad = ab - be - de;
          if (ad >= -mN && ad <= mN) {
            for (int bc = -mN; bc <= mN; ++bc) {
              for (int cf = -mN; cf <= mN; ++cf) {
                final int ef = cf - be + bc;
                if (ef >= -mN && ef <= mN) {
                  for (int fi = -mN; fi <= mN; ++fi) {
                    for (int hi = -mN; hi <= mN; ++hi) {
                      final int eh = ef - fi - hi;
                      if (eh >= -mN && eh <= mN) {
                        for (int gh = -mN; gh <= mN; ++gh) {
                          final int dg = de - eh - gh;
                          if (dg >= -mN && dg <= mN) {
                            ++count;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
