package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147978 <code>7^n-6^n-5^n-4^n-3^n-2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A147978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147978() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {-5, -14, -42, -98, 126, 4606, 50478});
  }
}
