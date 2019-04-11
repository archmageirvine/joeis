package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042406 Numerators of continued fraction convergents to <code>sqrt(731)</code>.
 * @author Sean A. Irvine
 */
public class A042406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042406() {
    super(new long[] {-1, 0, 1460, 0}, new long[] {27, 730, 39447, 1065799});
  }
}
