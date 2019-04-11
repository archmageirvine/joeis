package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191465 <code>9^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A191465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191465() {
    super(new long[] {-18, 11}, new long[] {0, 7});
  }
}
