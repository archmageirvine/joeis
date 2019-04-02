package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042708 Numerators of continued fraction convergents to sqrt(884).
 * @author Sean A. Irvine
 */
public class A042708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042708() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3330, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 30, 89, 119, 327, 446, 1219, 1665, 97789, 99454, 296697, 396151, 1088999, 1485150, 4059299, 5544449});
  }
}
