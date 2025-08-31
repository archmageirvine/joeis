package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A079886 Values of x+y where p runs through the primes of form 4k+1 and p=x^2+y^2, 0&lt;=x&lt;=y.
 * @author Sean A. Irvine
 */
public class A079886 extends A002144 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = Z.ZERO;
    while (true) {
      x = x.add(1);
      final Z[] q = p.subtract(x.square()).sqrtAndRemainder();
      if (q[1].isZero()) {
        return x.add(q[0]);
      }
    }
  }
}
