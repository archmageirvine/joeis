package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059410 J_n(9) (see A059379).
 * @author Sean A. Irvine
 */
public class A059410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059410() {
    super(new long[] {-27, 12}, new long[] {0, 6});
  }
}
