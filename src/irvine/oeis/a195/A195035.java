package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195035 Multiples of 15 and of 8 interleaved: a(2n-1) = 15n, a(2n) = 8n.
 * @author Sean A. Irvine
 */
public class A195035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195035() {
    super(new long[] {-1, 0, 2, 0}, new long[] {15, 8, 30, 16});
  }
}
