package irvine.oeis.a283;
// manually A283765/posubse at 2022-06-08 17:10

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a022.A022843;

/**
 * A283778 Numbers k such that floor(k*e) is odd.
 * @author Georg Fischer
 */
public class A283778 extends PositionSubsequence {

  /** Construct the sequence. */
  public A283778() {
    super(0, new A022843());
  }

  @Override
  public boolean isOk(final Z term) {
    return term.isOdd();
  }
}
