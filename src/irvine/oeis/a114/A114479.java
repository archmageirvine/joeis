package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114479 Kekul\u00e9 numbers for certain benzenoids.
 * @author Sean A. Irvine
 */
public class A114479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114479() {
    super(new long[] {-8, 8}, new long[] {3, 20});
  }
}
