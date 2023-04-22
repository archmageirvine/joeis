package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063269 a(1) = 3, a(n) = concatenation of two closest factors of a(n-1) whose product equals a(n-1) or if a(n-1) is a prime then the concatenation of 1 and a(n-1).
 * @author Sean A. Irvine
 */
public class A063269 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
       mA = Z.THREE;
    } else {
      final Z[] d = Jaguar.factor(mA).divisorsSorted();
      mA = new Z(d[d.length / 2 - 1].toString() + d[d.length / 2]);
    }
    return mA;
  }
}
