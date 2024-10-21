package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a362.A362123;

/**
 * A072656.
 * @author Sean A. Irvine
 */
public class A072685 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072685() {
    super(1, 0, new A362123(), PRIME);
  }
}
