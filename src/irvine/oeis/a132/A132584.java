package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132584.
 * @author Sean A. Irvine
 */
public class A132584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132584() {
    super(new long[] {1, -19, 19}, new long[] {0, 4, 80});
  }
}
