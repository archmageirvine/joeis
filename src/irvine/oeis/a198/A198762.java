package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198762 a(n) = 3*5^n - 1 = 2*A057651(n).
 * @author Sean A. Irvine
 */
public class A198762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198762() {
    super(new long[] {-5, 6}, new long[] {2, 14});
  }
}
