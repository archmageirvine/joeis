package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041500 Numerators of continued fraction convergents to sqrt(267).
 * @author Sean A. Irvine
 */
public class A041500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041500() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4804, 0, 0, 0, 0, 0}, new long[] {16, 33, 49, 768, 817, 2402, 77681, 157764, 235445, 3689439, 3924884, 11539207});
  }
}
