package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156849 Numbers n such that n^2 == 2 mod (23^2).
 * @author Sean A. Irvine
 */
public class A156849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156849() {
    super(new long[] {-1, 1, 1}, new long[] {156, 373, 685});
  }
}
