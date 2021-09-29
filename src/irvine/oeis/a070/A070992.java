package irvine.oeis.a070;
// manually partsum at 2021-09-29

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002487;

/**
 * A070992 Partial sums of A002487.
 * @author Georg Fischer
 */
public class A070992 extends PartialSumSequence {

  /** Construct the sequence. */
  public A070992() {
    super(new A002487());
    super.next();
    super.next();
    mSum = Z.ZERO;
  }
}
