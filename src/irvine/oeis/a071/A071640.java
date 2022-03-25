package irvine.oeis.a071;
// manually partsumm/partsum at 2022-03-24 22:56

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a040.A040051;

/**
 * A071640 a(n) = Sum_{i=1..n} A040051(i).
 * @author Georg Fischer
 */
public class A071640 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071640() {
    super(new SkipSequence(new A040051(), 1));
  }
}
