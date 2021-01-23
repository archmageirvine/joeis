package irvine.oeis.a030;

import irvine.oeis.PartialSumSequence;

/**
 * A030502 n-th partial sum of A030496.
 * @author Sean A. Irvine
 */
public class A030502 extends PartialSumSequence {

  /** Construct the sequence. */
  public A030502() {
    super(new A030496());
  }
}

