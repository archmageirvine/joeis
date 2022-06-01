package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104487 a(n+3) = 6a(n+2) - 10a(n+1) + 3a(n); a(0) = 1, a(1) = 4, a(2) = 14.
 * @author Sean A. Irvine
 */
public class A104487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104487() {
    super(new long[] {3, -10, 6}, new long[] {1, 4, 14});
  }
}
