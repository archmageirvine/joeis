package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a036.A036566;

/**
 * A025675 Exponent of 8 (value of j) in n-th number of form 7^i*8^j.
 * @author Sean A. Irvine
 */
public class A025675 extends A036566 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
