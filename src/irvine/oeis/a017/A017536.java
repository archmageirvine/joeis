package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017536 (12n+1)^4.
 * @author Sean A. Irvine
 */
public class A017536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017536() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 28561, 390625, 1874161, 5764801});
  }
}
