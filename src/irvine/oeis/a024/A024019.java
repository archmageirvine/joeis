package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024019 <code>2^n-n^9</code>.
 * @author Sean A. Irvine
 */
public class A024019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024019() {
    super(new long[] {2, -21, 100, -285, 540, -714, 672, -450, 210, -65, 12}, new long[] {1, 1, -508, -19675, -262128, -1953093, -10077632, -40353479, -134217472, -387419977, -999998976});
  }
}
