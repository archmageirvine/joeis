package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042111 Denominators of continued fraction convergents to <code>sqrt(580)</code>.
 * @author Sean A. Irvine
 */
public class A042111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042111() {
    super(new long[] {-1, 0, 578, 0}, new long[] {1, 12, 577, 6936});
  }
}
