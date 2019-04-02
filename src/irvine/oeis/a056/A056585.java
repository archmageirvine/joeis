package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056585 Eighth power of Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A056585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056585() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {0, 1, 1, 256, 6561, 390625, 16777216, 815730721, 37822859361L});
  }
}
