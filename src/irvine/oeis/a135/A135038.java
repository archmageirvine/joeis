package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135038.
 * @author Sean A. Irvine
 */
public class A135038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135038() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 840, 8760, 41520, 134544, 347064});
  }
}
