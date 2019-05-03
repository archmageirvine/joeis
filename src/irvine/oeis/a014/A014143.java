package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;

/**
 * A014143 Partial sums of <code>A014138</code>.
 * @author Sean A. Irvine
 */
public class A014143 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014143() {
    super(new SkipSequence(new A014138(), 1));
  }
}
