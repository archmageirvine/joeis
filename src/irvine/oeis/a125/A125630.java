package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125630.
 * @author Sean A. Irvine
 */
public class A125630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125630() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {9, 81, 729, 6561, 59049, 531441, 4782969, 43006401});
  }
}
