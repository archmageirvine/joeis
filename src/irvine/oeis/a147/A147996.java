package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147996 <code>9^n-8^n-7^n-6^n-5^n-4^n-3^n-2^n-1</code>.
 * @author Sean A. Irvine
 */
public class A147996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147996() {
    super(new long[] {362880, -1026576, 1172700, -723680, 269325, -63273, 9450, -870, 45}, new long[] {-7, -27, -123, -567, -2211, -2727, 84477, 1485513, 18362109});
  }
}
