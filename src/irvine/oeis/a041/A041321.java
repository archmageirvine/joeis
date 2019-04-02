package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041321 Denominators of continued fraction convergents to sqrt(174).
 * @author Sean A. Irvine
 */
public class A041321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041321() {
    super(new long[] {-1, 0, 0, 0, 2902, 0, 0, 0}, new long[] {1, 5, 21, 110, 2881, 14515, 60941, 319220});
  }
}
