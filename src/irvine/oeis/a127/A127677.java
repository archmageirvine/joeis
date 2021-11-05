package irvine.oeis.a127;
// manually deris2/essent 0 A110162 at 2021-11-04 15:02
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a110.A110162;

/**
 * A127677 Scaled coefficient table for Chebyshev polynomials 2*T(2*n, sqrt(x)/2) (increasing even scaled powers, without zero entries).
 * If the leading 2 is replaced by a 1 we get the essentially identical sequence A110162. - _N. J. A. Sloane_, Jun 09 2007
 * @author Georg Fischer
 */
public class A127677 extends A110162 {

  private int mN = -1;
  
  @Override
  public Z next() {
    return ++mN == 0 ? super.next().add(1) : super.next();
  }
}
