package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042525 Denominators of continued fraction convergents to <code>sqrt(791)</code>.
 * @author Sean A. Irvine
 */
public class A042525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042525() {
    super(new long[] {-1, 0, 450, 0}, new long[] {1, 8, 449, 3600});
  }
}
