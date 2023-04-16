package irvine.oeis.a062;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A062855 First differences of A062851.
 * @author Sean A. Irvine
 */
public class A062855 extends DifferenceSequence {

  /** Construct the sequence. */
  public A062855() {
    super(new PrependSequence(new A062851(), 0));
  }
}
