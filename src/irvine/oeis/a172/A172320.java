package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172320 <code>11th</code> column of <code>A172119</code>.
 * @author Sean A. Irvine
 */
public class A172320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172320() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024});
  }
}
