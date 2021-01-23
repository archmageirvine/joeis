package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024712 a(n) = residue mod 3 of n-th term of A024702.
 * @author Sean A. Irvine
 */
public class A024712 extends A024702 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
