package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a007.A007416;

/**
 * A053213 Differences between the minimal numbers (A007416).
 * @author Sean A. Irvine
 */
public class A053213 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053213() {
    super(1, new A007416());
  }
}
