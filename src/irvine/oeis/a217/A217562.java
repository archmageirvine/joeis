package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217562 Even numbers not divisible by 5.
 * @author Sean A. Irvine
 */
public class A217562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217562() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 6, 8, 12});
  }
}
