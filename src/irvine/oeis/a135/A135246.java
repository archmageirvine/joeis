package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135246 Shifted Pell recurrence: a(n) = 2*a(n-2) + a(n-4).
 * @author Sean A. Irvine
 */
public class A135246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135246() {
    super(new long[] {1, 0, 2, 0}, new long[] {1, 3, 5, 7});
  }
}
