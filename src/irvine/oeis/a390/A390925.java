package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390925 allocated for Robert P. P. McKone.
 * @author Sean A. Irvine
 */
public class A390925 extends Sequence0 {

  // abc
  // def
  // ghi
  //
  // At least one of a,b,c <= n-2.
  // At least one of a,d,g <= n-2.
  // At least one of a<b, b<e, c<f, etc.

  // There is a polynomial available for this sequence that ChatGPT proved correct, but I've kept
  // this code as a record of how I brute force computed some initial terms.

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (int a = 1; a <= mN; ++a) {
      for (int b = 1; b <= mN; ++b) {
        for (int c = 1; c <= mN; ++c) {
          if (a <= mN - 2 || b <= mN - 2 || c <= mN - 2) {
            for (int d = 1; d <= mN; ++d) {
              for (int g = 1; g <= mN; ++g) {
                if (a <= mN - 2 || d <= mN - 2 || g <= mN - 2) {
                  for (int e = 1; e <= mN; ++e) {
                    for (int f = 1; f <= mN; ++f) {
                      if (a < d || b < e || c < f) {
                        for (int h = 1; h <= mN; ++h) {
                          if (a < b || d < e || g < h) {
                            for (int i = 1; i <= mN; ++i) {
                              if (((a < b && b < c) || (d < e && e < f) || (g < h && h < i)) && ((a < d && d < g) || (b < e && e < h) || (c < f && f < i))) {
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
      }
    }
    return Z.valueOf(count);
  }
}
