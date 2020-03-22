package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030082 <code>a(n) = prime^3</code> and digits of prime appear in <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A030082 extends A030080 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
