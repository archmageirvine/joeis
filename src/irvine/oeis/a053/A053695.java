package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a005.A005250;

/**
 * A053695 Differences between record prime gaps.
 * @author Sean A. Irvine
 */
public class A053695 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053695() {
    super(new A005250());
  }
}
