package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156772 a(n) = 729*n - 198.
 * @author Sean A. Irvine
 */
public class A156772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156772() {
    super(1, new long[] {-1, 2}, new long[] {531, 1260});
  }
}
