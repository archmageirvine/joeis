package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190949.
 * @author Sean A. Irvine
 */
public class A190949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190949() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 5, 13, 89});
  }
}
