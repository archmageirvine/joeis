package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083581 8/3-5(-2)^n/3.
 * @author Sean A. Irvine
 */
public class A083581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083581() {
    super(new long[] {2, -1}, new long[] {1, 6});
  }
}
