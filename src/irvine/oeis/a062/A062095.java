package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062095 a(1) = 1, a(n) = concatenation of two closest factors of a(n-1) whose product equals a(n-1) or if a(n-1) is a prime then the concatenation of 1 and a(n-1).
 * @author Sean A. Irvine
 */
public class A062095 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.valueOf(11);
    } else {
      final Z[] d = Jaguar.factor(mA).divisorsSorted();
      mA = new Z(d[d.length / 2 - 1].toString() + d[d.length / 2]);
    }
    return mA;
  }
}
