package irvine.oeis.a146;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.Subsequence;
import irvine.oeis.a061.A061039;

/**
 * A146762 Terms of A061039 that are multiple of 10, in the order in which they appear.
 * @author Georg Fischer
 */
public class A146762 extends Subsequence {

  /** Construct the sequence. */
  public A146762() {
    super(new A061039());
  }

  @Override
  public boolean isOk(final Z term) {
    return term.mod(Z.TEN).isZero();
  }

}
