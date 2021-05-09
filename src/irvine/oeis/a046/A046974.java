package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000796;

/**
 * A046974 Partial sums of digits of decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A046974 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046974() {
    super(new A000796());
  }
}
