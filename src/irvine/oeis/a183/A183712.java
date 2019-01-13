package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183712.
 * @author Sean A. Irvine
 */
public class A183712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183712() {
    super(new long[] {-1, 1, 3}, new long[] {5, 17, 54});
  }
}
