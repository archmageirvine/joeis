package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A057523 Number of ways n-th powerful (1) number can be expressed as b^2*c^3.
 * @author Sean A. Irvine
 */
public class A057523 extends A001694 {

  @Override
  public Z next() {
    long cnt = 0;
    final Z n = super.next();
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.isSquare()) {
        final Z c = n.divide(d);
        final Z r = c.root(3);
        if (r.pow(3).equals(c)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
