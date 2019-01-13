package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255353.
 * @author Sean A. Irvine
 */
public class A255353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255353() {
    super(new long[] {1, 0, 0, -8, 0, 0, 8, 0, 0}, new long[] {2, 3, 6, 15, 24, 40, 104, 168, 273});
  }
}
