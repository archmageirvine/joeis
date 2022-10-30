package irvine.oeis.a030;

import irvine.oeis.PartialSumSequence;

/**
 * A030493 n-th partial sum of A030298.
 * @author Sean A. Irvine
 */
public class A030493 extends PartialSumSequence {

  /** Construct the sequence. */
  public A030493() {
    super(1, new A030298());
  }
}

