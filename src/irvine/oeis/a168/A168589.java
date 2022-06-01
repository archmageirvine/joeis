package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168589 a(n) = (2 - 3^n)*(-1)^n.
 * @author Sean A. Irvine
 */
public class A168589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168589() {
    super(new long[] {-3, -4}, new long[] {1, 1});
  }
}
