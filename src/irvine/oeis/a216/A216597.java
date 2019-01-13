package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216597.
 * @author Sean A. Irvine
 */
public class A216597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216597() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {0, -1, -5, -22, -91, -364});
  }
}
