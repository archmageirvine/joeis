package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041328 Numerators of continued fraction convergents to <code>sqrt(178)</code>.
 * @author Sean A. Irvine
 */
public class A041328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041328() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 3202, 0, 0, 0, 0, 0}, new long[] {13, 27, 40, 507, 547, 1601, 42173, 85947, 128120, 1623387, 1751507, 5126401});
  }
}
