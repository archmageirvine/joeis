package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028086.
 * @author Sean A. Irvine
 */
public class A028086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028086() {
    super(new long[] {-1980, 1368, -317, 30}, new long[] {1, 30, 583, 9348});
  }
}
