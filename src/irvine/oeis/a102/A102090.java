package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102090.
 * @author Sean A. Irvine
 */
public class A102090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102090() {
    super(new long[] {-1, 1, 11, -10, -24, 10, 19, 3}, new long[] {47, 228, 1511, 9213, 57536, 356863, 2217871, 13775700});
  }
}
