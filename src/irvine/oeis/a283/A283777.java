package irvine.oeis.a283;
// manually A283765/posubse at 2022-06-08 17:10

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a022.A022843;

/**
 * A283777 Numbers k such that floor(k*e) is even.
 * @author Georg Fischer
 */
public class A283777 extends PositionSubsequence {

  /** Construct the sequence. */
  public A283777() {
    super(new A022843(), 0);
    next();
  }

  @Override
  public boolean isOk(final Z term) {
    return term.isEven();
  }
}
