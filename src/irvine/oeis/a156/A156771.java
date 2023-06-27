package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156771 a(n) = 729*n - 531.
 * @author Sean A. Irvine
 */
public class A156771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156771() {
    super(1, new long[] {-1, 2}, new long[] {198, 927});
  }
}
