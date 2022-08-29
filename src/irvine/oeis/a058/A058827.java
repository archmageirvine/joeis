package irvine.oeis.a058;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a002.A002202;
import irvine.oeis.a005.A005278;

/**
 * A058827 Totients which are not cototients.
 * @author Sean A. Irvine
 */
public class A058827 extends IntersectionSequence {

  /** Construct the sequence. */
  public A058827() {
    super(new A005278(), new A002202());
  }
}
