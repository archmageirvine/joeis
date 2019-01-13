package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275155.
 * @author Sean A. Irvine
 */
public class A275155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275155() {
    super(new long[] {1, -7, 7}, new long[] {18, 64, 338});
  }
}
