package irvine.oeis.a145;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a051.A051442;

/**
 * A145329 Partial sums of A051442, starting at n=1.
 * @author Georg Fischer
 */
public class A145329 extends PartialSumSequence {

  /** Construct the sequence. */
  public A145329() {
    super(1, new SkipSequence(new A051442(), 1));
  }
}
