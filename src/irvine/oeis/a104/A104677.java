package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104677 a(n) = binomial(n+3,3)*binomial(n+8,3).
 * @author Sean A. Irvine
 */
public class A104677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104677() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {56, 336, 1200, 3300, 7700, 16016, 30576});
  }
}
