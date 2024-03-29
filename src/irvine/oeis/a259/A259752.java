package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259752 a(n) = 24*n - 18.
 * @author Sean A. Irvine
 */
public class A259752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259752() {
    super(1, new long[] {-1, 2}, new long[] {6, 30});
  }
}
