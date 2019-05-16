package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A022460 <code>a(n) = prime(3*n) mod prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A022460 extends A000040 {

  private final A000040 mP = new A000040();

  @Override
  public Z next() {
    mP.next();
    mP.next();
    return mP.next().mod(super.next());
  }
}
