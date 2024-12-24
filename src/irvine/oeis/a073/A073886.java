package irvine.oeis.a073;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A073886 Terms which retain their position in A073885, i.e., terms for which A073885(n) = n.
 * @author Sean A. Irvine
 */
public class A073886 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A073886() {
    super(1, new A073885());
  }
}
