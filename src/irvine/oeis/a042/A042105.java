package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042105 Denominators of continued fraction convergents to <code>sqrt(577)</code>.
 * @author Sean A. Irvine
 */
public class A042105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042105() {
    super(new long[] {1, 48}, new long[] {1, 48});
  }
}
