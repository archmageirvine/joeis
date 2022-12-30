package irvine.oeis.a076;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a060.A060370;

/**
 * A076517 Partial sums of A060370 (cf. A006556).
 * @author Georg Fischer
 */
public class A076517 extends PartialSumSequence {

  /** Construct the sequence. */
  public A076517() {
    super(1, new SkipSequence(new A060370(), 3));
  }
}
