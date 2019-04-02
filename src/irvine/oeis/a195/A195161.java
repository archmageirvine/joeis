package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195161 Multiples of 8 and odd numbers interleaved.
 * @author Sean A. Irvine
 */
public class A195161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195161() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, 8, 3});
  }
}
