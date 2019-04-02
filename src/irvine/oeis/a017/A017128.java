package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017128 a(n) = (8*n + 5)^4.
 * @author Sean A. Irvine
 */
public class A017128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017128() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 28561, 194481, 707281, 1874161});
  }
}
