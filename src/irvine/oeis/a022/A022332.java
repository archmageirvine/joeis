package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003592;

/**
 * A022332 Exponent of <code>2</code> (value of <code>i)</code> in n-th number of form <code>2^i*5^j</code>.
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
