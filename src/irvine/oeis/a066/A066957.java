package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A066957 a(n) = number of ways of placing '+' and '-' among the digits 123456789 so that the result of the expression is n, '-' before 1 IS allowed.
 * @author Sean A. Irvine
 */
public class A066957 extends Sequence1 {

  private final DynamicIntArray mA = new DynamicIntArray();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 123456789) {
      return Z.ZERO;
    } else if (mN == 0) {
      // Compute all the terms
      // 00 = concat
      // 01 = +
      // 10 = 1
      for (int operator = 0; operator < 6561; ++operator) { // 6561 = 3^8
        for (int k = -1; k <= 1; k += 2) { // k is sign in front of "1"
          int v = 0;
          int u = k;
          for (int d = 2, op = operator; d <= 9; ++d, op /= 3) {
            switch (op % 3) {
              case 0:
                u *= 10;
                if (u >= 0) {
                  u += d;
                } else {
                  u -= d;
                }
                break;
              case 1:
                v += u;
                u = d;
                break;
              default:
                v += u;
                u = -d;
            }
          }
          v += u;
          if (v >= 0) {
            mA.increment(v);
          }
        }
      }
    }
    return Z.valueOf(mA.get((int) mN));
  }
}
