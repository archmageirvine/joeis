package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;

/**
 * A046898 Partial sums of A046897.
 * @author Sean A. Irvine
 */
public class A046898 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046898() {
    super(1, new A046897());
  }
}
