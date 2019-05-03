package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191761 Last digit of <code>(2*n)^2</code>. Also period <code>5</code>: repeat <code>[0, 4, 6, 6, 4]</code>.
 * @author Sean A. Irvine
 */
public class A191761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191761() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 4, 6, 6, 4});
  }
}
