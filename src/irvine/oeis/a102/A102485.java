package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102485 <code>a(n) = 5*3^n - 4*2^n</code>.
 * @author Sean A. Irvine
 */
public class A102485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102485() {
    super(new long[] {-6, 5}, new long[] {1, 7});
  }
}
