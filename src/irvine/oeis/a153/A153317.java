package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153317 Denominators of continued fraction convergents to sqrt(6/5).
 * @author Sean A. Irvine
 */
public class A153317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153317() {
    super(new long[] {-1, 0, 22, 0}, new long[] {1, 10, 21, 220});
  }
}
