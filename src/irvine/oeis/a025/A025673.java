package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025673 Exponent of 8 (value of j) in n-th number of form 5^i*8^j.
 * @author Sean A. Irvine
 */
public class A025673 extends A025623 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
