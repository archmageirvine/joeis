package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082975 Denominators of continued fraction convergents to <code>(sqrt(37)-4)/3</code>.
 * @author Sean A. Irvine
 */
public class A082975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082975() {
    super(new long[] {1, 0, 0, 12, 0, 0}, new long[] {1, 1, 3, 10, 13, 36});
  }
}
