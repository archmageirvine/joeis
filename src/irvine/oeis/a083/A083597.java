package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083597 a(n) = (7*4^n - 4)/3.
 * @author Sean A. Irvine
 */
public class A083597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083597() {
    super(new long[] {-4, 5}, new long[] {1, 8});
  }
}
