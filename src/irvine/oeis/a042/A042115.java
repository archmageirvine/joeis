package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042115 Denominators of continued fraction convergents to <code>sqrt(582)</code>.
 * @author Sean A. Irvine
 */
public class A042115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042115() {
    super(new long[] {-1, 0, 386, 0}, new long[] {1, 8, 385, 3088});
  }
}
