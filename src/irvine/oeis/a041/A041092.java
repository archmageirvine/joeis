package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041092 Numerators of continued fraction convergents to <code>sqrt(54)</code>.
 * @author Sean A. Irvine
 */
public class A041092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041092() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 970, 0, 0, 0, 0, 0}, new long[] {7, 15, 22, 147, 169, 485, 6959, 14403, 21362, 142575, 163937, 470449});
  }
}
