package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A040996 Maximum number of distinct functions at the bottom of a Boolean (or Binary) Decision Diagram (or BDD) with negation by pointer complementation.
 * @author Sean A. Irvine
 */
public class A040996 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft(1L << mN).subtract(1).shiftLeft((1L << mN) - 1);
  }
}
