package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047850 a(n) = (5^n + 3)/4.
 * @author Sean A. Irvine
 */
public class A047850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047850() {
    super(new long[] {-5, 6}, new long[] {1, 2});
  }
}
