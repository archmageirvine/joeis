package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042746 Numerators of continued fraction convergents to <code>sqrt(904)</code>.
 * @author Sean A. Irvine
 */
public class A042746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042746() {
    super(new long[] {-1, 0, 902, 0}, new long[] {30, 451, 27090, 406801});
  }
}
