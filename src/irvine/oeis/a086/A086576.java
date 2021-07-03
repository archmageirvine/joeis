package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086576 a(n) = k where R(k+5) = 5.
 * @author Sean A. Irvine
 */
public class A086576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086576() {
    super(new long[] {-10, 11}, new long[] {0, 45});
  }
}
