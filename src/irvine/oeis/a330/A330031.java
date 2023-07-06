package irvine.oeis.a330;

import irvine.oeis.PairSumSequence;
import irvine.oeis.a000.A000292;

/**
 * A330031 Sums of two nonzero tetrahedral numbers (A000292).
 * @author Sean A. Irvine
 */
public class A330031 extends PairSumSequence {

  /** Construct the sequence. */
  public A330031() {
    super(new A000292().skip(1));
  }
}
