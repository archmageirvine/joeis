package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060544 Centered 9-gonal (also known as nonagonal or enneagonal) numbers. Every third triangular number, starting with a(1)=1.
 * @author Sean A. Irvine
 */
public class A060544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060544() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 10, 28});
  }
}
