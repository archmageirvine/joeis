package irvine.oeis.a260;
// manually 2025-07-26/enumof2 at 2025-07-26 17:45

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A260488 Numbers of the form 2^m * (6k + 1) for m, k &gt;= 0, and 0.
 * @author Georg Fischer
 */
public class A260488 extends TwoParameterFormSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A260488() {
    super(0, 0, 0, (k, m) -> Z.TWO.pow(m).multiply(Z.valueOf(6 * k + 1)));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return super.next();
  }
}
