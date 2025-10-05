package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080941 Greatest proper divisor of n which is a suffix of n in binary representation; a(n) = 0 if no such divisor exists.
 * @author Sean A. Irvine
 */
public class A080941 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z[] d = Jaguar.factor(mN).divisorsSorted();
    final String s = mN.toString(2);
    for (int k = d.length - 2; k >= 0; --k) {
      if (s.endsWith(d[k].toString(2))) {
        return d[k];
      }
    }
    return Z.ZERO;
  }
}
