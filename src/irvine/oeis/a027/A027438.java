package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A027438 Largest prime factor of [e*2^n].
 * @author Sean A. Irvine
 */
public class A027438 extends A027437 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return p[p.length - 1];
  }
}
