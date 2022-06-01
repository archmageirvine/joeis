package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016795 a(n) = (3n+2)^7.
 * @author Sean A. Irvine
 */
public class A016795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016795() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 78125, 2097152, 19487171, 105413504, 410338673, 1280000000, 3404825447L});
  }
}
