package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042921 Denominators of continued fraction convergents to <code>sqrt(992)</code>.
 * @author Sean A. Irvine
 */
public class A042921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042921() {
    super(new long[] {-1, 0, 126, 0}, new long[] {1, 2, 125, 252});
  }
}
