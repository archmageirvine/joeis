package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176777 <code>2^n-n*(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A176777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176777() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 4, 6, 8});
  }
}
