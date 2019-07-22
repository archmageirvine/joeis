package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024713 <code>a(n) =</code> residue <code>mod 5</code> of n-th term of <code>A024702</code>.
 * @author Sean A. Irvine
 */
public class A024713 extends A024702 {

  @Override
  public Z next() {
    return super.next().mod(Z.FIVE);
  }
}
