package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064843 A064842/2.
 * @author Sean A. Irvine
 */
public class A064843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064843() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 3, 9, 18});
  }
}
