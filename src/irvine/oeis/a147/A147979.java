package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147979 8^n-7^n-6^n-5^n-4^n-3^n-2^n-1.
 * @author Sean A. Irvine
 */
public class A147979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147979() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {-6, -20, -76, -272, -580, 3760, 77324, 896848});
  }
}
