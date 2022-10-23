package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035336 a(n) = 2*floor(n*phi) + n - 1, where phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A035336 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().multiply2().add(mN - 1);
  }
}

