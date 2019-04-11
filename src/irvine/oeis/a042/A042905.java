package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042905 Denominators of continued fraction convergents to <code>sqrt(984)</code>.
 * @author Sean A. Irvine
 */
public class A042905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042905() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 177610, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 19, 141, 301, 743, 1044, 2831, 176566, 355963, 532529, 1421021, 3374571, 25043018, 53460607, 131964232, 185424839, 502813910});
  }
}
