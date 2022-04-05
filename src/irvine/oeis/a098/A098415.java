package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.a007.A007529;

/**
 * A098415 Greatest members r of prime triples (p,q,r) with p&lt;q&lt;r=p+6.
 * @author Sean A. Irvine
 */
public class A098415 extends A007529 {

  @Override
  public Z next() {
    return super.next().add(6);
  }
}
