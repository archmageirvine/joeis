package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195031 Multiples of 5 and of 12 interleaved: a(2n-1) = 5n, a(2n) = 12n.
 * @author Sean A. Irvine
 */
public class A195031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195031() {
    super(new long[] {-1, 0, 2, 0}, new long[] {5, 12, 10, 24});
  }
}
