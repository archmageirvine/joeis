package irvine.oeis.a062;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A062852.
 * @author Sean A. Irvine
 */
public class A062855 extends DifferenceSequence {

  /** Construct the sequence. */
  public A062855() {
    super(new PrependSequence(new A062851(), 0));
  }
}
