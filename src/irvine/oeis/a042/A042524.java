package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042524 Numerators of continued fraction convergents to <code>sqrt(791)</code>.
 * @author Sean A. Irvine
 */
public class A042524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042524() {
    super(new long[] {-1, 0, 450, 0}, new long[] {28, 225, 12628, 101249});
  }
}
