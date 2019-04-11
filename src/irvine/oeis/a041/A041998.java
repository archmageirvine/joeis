package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041998 Numerators of continued fraction convergents to <code>sqrt(522)</code>.
 * @author Sean A. Irvine
 */
public class A041998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041998() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39206, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {22, 23, 137, 160, 297, 1348, 1645, 2993, 16610, 19603, 879142, 898745, 5372867, 6271612, 11644479, 52849528, 64494007, 117343535, 651211682, 768555217});
  }
}
