package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078282 a(1) = 1, a(n) is the smallest multiple of n which begins with a(n-1) and is greater than a(n-1).
 * @author Sean A. Irvine
 */
public class A078282 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z n = Z.valueOf(mN);
      Z tens = Z.ONE;
      while (true) {
        tens = tens.multiply(10);
        final Z w = mA.multiply(tens);
        if (w.mod(mN) == 0) {
          mA = w;
          break;
        }
        final Z v = n.subtract(tens.modMultiply(mA, n));
        if (v.compareTo(tens) < 0) {
          mA = w.add(v);
          break;
        }
      }
    }
    return mA;
  }
}

