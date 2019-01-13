package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160699.
 * @author Sean A. Irvine
 */
public class A160699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160699() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 17, 154, 531});
  }
}
