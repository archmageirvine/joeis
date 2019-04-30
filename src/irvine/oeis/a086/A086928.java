package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086928 <code>a(n) = 12a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 12, a(n) = (6+sqrt(37))^n + (6-sqrt(37))^n</code>.
 * @author Sean A. Irvine
 */
public class A086928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086928() {
    super(new long[] {1, 12}, new long[] {2, 12});
  }
}
