package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042061 Denominators of continued fraction convergents to sqrt(554).
 * @author Sean A. Irvine
 */
public class A042061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042061() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 348586, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 13, 54, 67, 121, 551, 3427, 3978, 7405, 344608, 352013, 696621, 4531739, 18823577, 23355316, 42178893, 192070888, 1194604221, 1386675109, 2581279330L});
  }
}
