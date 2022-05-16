package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A023517 Greatest prime divisor of p(n)*p(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A023517 extends A023515 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return p[p.length - 1];
  }
}
