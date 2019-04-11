package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017536 <code>(12n+1)^4</code>.
 * @author Sean A. Irvine
 */
public class A017536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017536() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 28561, 390625, 1874161, 5764801});
  }
}
