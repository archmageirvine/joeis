package irvine.oeis.a058;

import irvine.oeis.ComplementSequence;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a002.A002202;
import irvine.oeis.a005.A005278;

/**
 * A058825 Numbers which are both totients and cototients.
 * @author Sean A. Irvine
 */
public class A058825 extends IntersectionSequence {

  /** Construct the sequence. */
  public A058825() {
    super(new A002202(), new ComplementSequence(new A005278()));
  }
}
