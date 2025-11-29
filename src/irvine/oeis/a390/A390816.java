package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006667;

/**
 * A390816 Number of tripling steps in the Collatz 3x+1 iteration going from 2^n-1 to 1.
 * @author Sean A. Irvine
 */
public class A390816 extends Sequence1 {

  private final DirectSequence mCollatz = new A006667();
  private long mN = 0;

  @Override
  public Z next() {
    return mCollatz.a(Z.ONE.shiftLeft(++mN).subtract(1));
  }
}
