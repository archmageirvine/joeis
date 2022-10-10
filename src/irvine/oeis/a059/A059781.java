package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a027.A027907;

/**
 * A059781 Triangle T(n,k) giving exponent of power of 2 dividing entry (n,k) of trinomial triangle A027907.
 * @author Sean A. Irvine
 */
public class A059781 extends A027907 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}
