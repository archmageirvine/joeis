package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001113;

/**
 * A046975 Partial sums of digits of decimal expansion of e.
 * @author Sean A. Irvine
 */
public class A046975 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046975() {
    super(new A001113());
  }
}
