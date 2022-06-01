package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228912 a(n) = 10^n - 9*9^n + 36*8^n - 84*7^n + 126*6^n - 126*5^n + 84*4^n - 36*3^n + 9*2^n - 1.
 * @author Sean A. Irvine
 */
public class A228912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228912() {
    super(new long[] {-3628800, 10628640, -12753576, 8409500, -3416930, 902055, -157773, 18150, -1320, 55}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 362880});
  }
}
