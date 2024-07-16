package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;

/**
 * A071331 Numbers having no decomposition into a sum of two prime powers.
 * @author Sean A. Irvine
 */
public class A071331 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071331() {
    super(1, new A071330(), ZERO);
  }
}
