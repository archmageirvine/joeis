package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127408 Negative value of coefficient of <code>x^(n-3)</code> in the characteristic polynomial of a certain n X n integer circulant matrix.
 * @author Sean A. Irvine
 */
public class A127408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127408() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {18, 144, 625, 1980, 5145, 11648, 23814});
  }
}
