package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094196.
 * @author Sean A. Irvine
 */
public class A094196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094196() {
    super(new long[] {1, -1, 0, 0, 0, 0, -10, 10, 0, 0, 0, 0, 1}, new long[] {1, 9, 20, 25, 44, 76, 121, 197, 304, 353, 540, 856, 1301});
  }
}
