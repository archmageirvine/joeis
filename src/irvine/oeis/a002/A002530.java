package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002530 Denominators of continued fraction convergents to sqrt(3).
 * @author Sean A. Irvine
 */
public class A002530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002530() {
    super(new long[] {-1, 0, 4, 0}, new long[] {0, 1, 1, 3});
  }
}
