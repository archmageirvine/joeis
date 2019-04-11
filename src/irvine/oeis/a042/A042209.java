package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042209 Denominators of continued fraction convergents to <code>sqrt(630)</code>.
 * @author Sean A. Irvine
 */
public class A042209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042209() {
    super(new long[] {-1, 0, 502, 0}, new long[] {1, 10, 501, 5020});
  }
}
