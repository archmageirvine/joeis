package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A022332 Exponent of 2 (value of i) in n-th number of form 2^i*5^j.
 * @author Sean A. Irvine
 */
public class A022332 extends A003592 {

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
