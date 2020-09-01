package irvine.oeis.a034;

import irvine.oeis.PositionSequence;

/**
 * A034780 Numbers k such that A034693(k) = 4.
 * @author Sean A. Irvine
 */
public class A034780 extends PositionSequence {

  /** Construct the sequence. */
  public A034780() {
    super(1, new A034693(), 4);
  }
}
