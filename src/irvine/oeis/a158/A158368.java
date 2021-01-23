package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158368 529n + 1.
 * @author Sean A. Irvine
 */
public class A158368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158368() {
    super(new long[] {-1, 2}, new long[] {530, 1059});
  }
}
