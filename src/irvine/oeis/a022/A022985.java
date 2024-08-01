package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022985 a(n) = 29 - n.
 * @author Sean A. Irvine
 */
public class A022985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022985() {
    super(new long[] {-1, 2}, new long[] {29, 28});
  }
}
