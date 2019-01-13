package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116797.
 * @author Sean A. Irvine
 */
public class A116797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116797() {
    super(new long[] {-4, 7, -9, 15, -13, 6}, new long[] {1, 2, 6, 21, 73, 241});
  }
}
