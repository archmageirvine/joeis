package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055268.
 * @author Sean A. Irvine
 */
public class A055268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055268() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 15, 65, 185, 420});
  }
}
