package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082784 Characteristic function of multiples of 7.
 * @author Sean A. Irvine
 */
public class A082784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082784() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0});
  }
}
