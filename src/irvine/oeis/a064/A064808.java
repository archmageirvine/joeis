package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064808.
 * @author Sean A. Irvine
 */
public class A064808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064808() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 9, 22});
  }
}
