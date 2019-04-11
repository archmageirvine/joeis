package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088666 <code>a(n) = (n^4 + 1) mod 10</code>.
 * @author Sean A. Irvine
 */
public class A088666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088666() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 7, 2, 7, 6, 7, 2, 7, 2});
  }
}
