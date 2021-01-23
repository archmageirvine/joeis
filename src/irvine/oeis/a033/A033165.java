package irvine.oeis.a033;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a013.A013631;

/**
 * A033165 First occurrence of n as a term in the continued fraction for zeta(3).
 * @author Sean A. Irvine
 */
public class A033165 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A033165() {
    super(new A013631());
  }
}
