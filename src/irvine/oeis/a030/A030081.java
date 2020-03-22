package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030081 <code>a(n) = prime^2</code> and digits of prime appear in <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A030081 extends A030079 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
