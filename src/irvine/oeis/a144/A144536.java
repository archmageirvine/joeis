package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144536 Denominators of continued fraction convergents to sqrt(3)/2.
 * @author Sean A. Irvine
 */
public class A144536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144536() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, 1, 7, 15});
  }
}
