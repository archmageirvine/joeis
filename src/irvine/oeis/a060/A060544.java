package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060544 Centered 9-gonal (also known as nonagonal or enneagonal) numbers. Every third triangular number, starting with <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A060544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060544() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 28});
  }
}
