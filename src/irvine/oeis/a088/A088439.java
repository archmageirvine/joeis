package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088439 <code>a(3n) = 3n,</code> otherwise <code>a(n) = 1</code>.
 * @author Sean A. Irvine
 */
public class A088439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088439() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 3, 1, 1});
  }
}
