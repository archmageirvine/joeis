package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238738.
 * @author Sean A. Irvine
 */
public class A238738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238738() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 3, 5, 7, 11, 15, 18});
  }
}
