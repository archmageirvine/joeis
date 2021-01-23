package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025676 Exponent of 8 (value of i) in n-th number of form 8^i*9^j.
 * @author Sean A. Irvine
 */
public class A025676 extends A025633 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
