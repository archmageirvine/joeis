package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114480 Kekul\u00e9 numbers for certain benzenoids.
 * @author Sean A. Irvine
 */
public class A114480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114480() {
    super(new long[] {-25, 15}, new long[] {4, 50});
  }
}
