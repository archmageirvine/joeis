package irvine.oeis.a153;
// manually partsumm/partsum at 2022-03-24 22:56

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a003.A003266;

/**
 * A153757 a(n) = Sum_{k=1..n} A003266(k).
 * @author Georg Fischer
 */
public class A153757 extends PartialSumSequence {

  /** Construct the sequence. */
  public A153757() {
    super(new SkipSequence(new A003266(), 1));
  }
}
