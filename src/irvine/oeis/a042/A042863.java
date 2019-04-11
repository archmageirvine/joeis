package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042863 Denominators of continued fraction convergents to <code>sqrt(963)</code>.
 * @author Sean A. Irvine
 */
public class A042863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042863() {
    super(new long[] {-1, 0, 1924, 0}, new long[] {1, 31, 1923, 59644});
  }
}
