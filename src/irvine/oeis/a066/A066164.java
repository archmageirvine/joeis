package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066164 Sum of interior angles in an n-sided polygon in degrees.
 * @author Sean A. Irvine
 */
public class A066164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066164() {
    super(new long[] {-1, 2}, new long[] {180, 360});
  }
}
