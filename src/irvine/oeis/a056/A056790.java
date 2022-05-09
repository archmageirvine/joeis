package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A056790 Greatest prime factor of n^n + (n+1)^(n+1).
 * @author Sean A. Irvine
 */
public class A056790 extends A056788 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return p[p.length - 1];
  }
}
