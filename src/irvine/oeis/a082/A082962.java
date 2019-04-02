package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082962 Numerators of continued fraction convergents to (sqrt(37)-4)/3.
 * @author Sean A. Irvine
 */
public class A082962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082962() {
    super(new long[] {1, 0, 0, 12, 0, 0}, new long[] {0, 1, 2, 7, 9, 25});
  }
}
