package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025646 Exponent of 4 (value of i) in n-th number of form 4^i*5^j.
 * @author Sean A. Irvine
 */
public class A025646 extends A025617 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 2);
  }
}
