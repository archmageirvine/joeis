package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024714 a(n) = residue mod 7 of n-th term of A024702.
 * @author Sean A. Irvine
 */
public class A024714 extends A024702 {

  @Override
  public Z next() {
    return super.next().mod(Z.SEVEN);
  }
}
