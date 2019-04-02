package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086928 a(n) = 12a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 12, a(n) = (6+sqrt(37))^n + (6-sqrt(37))^n.
 * @author Sean A. Irvine
 */
public class A086928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086928() {
    super(new long[] {1, 12}, new long[] {2, 12});
  }
}
