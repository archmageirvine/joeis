package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000959;

/**
 * A046279 Sum of first n lucky numbers.
 * @author Sean A. Irvine
 */
public class A046279 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046279() {
    super(new A000959());
  }
}
