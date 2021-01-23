package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278742 Lexicographically least strictly increasing sequence such that, for any n&gt;0, Sum_{k=1..n} a(k) can be computed without carries in base 10.
 * @author Sean A. Irvine
 */
public class A278742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278742() {
    super(new long[] {10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 10, 11, 12, 20, 30, 100, 110, 200, 300, 1000, 1100, 2000, 2100, 3000});
  }
}
