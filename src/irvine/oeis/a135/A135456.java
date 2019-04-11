package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135456 Number of surjections from an n-element set onto a seven-element set.
 * @author Sean A. Irvine
 */
public class A135456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135456() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {5040, 141120, 2328480, 29635200, 322494480, 3162075840L, 28805736960L});
  }
}
