package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191468 8^n - 5^n.
 * @author Sean A. Irvine
 */
public class A191468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191468() {
    super(new long[] {-40, 13}, new long[] {0, 3});
  }
}
