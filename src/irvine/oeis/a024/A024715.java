package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024715 <code>a(n) =</code> residue <code>mod 11</code> of n-th term of <code>A024702</code>.
 * @author Sean A. Irvine
 */
public class A024715 extends A024702 {

  private static final Z ELEVEN = Z.valueOf(11);

  @Override
  public Z next() {
    return super.next().mod(ELEVEN);
  }
}
