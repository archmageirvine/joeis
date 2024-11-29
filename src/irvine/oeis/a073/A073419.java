package irvine.oeis.a073;

import irvine.oeis.NoncomputableSequence;

/**
 * A073419 Worthless numbers: numbers without h, o, r, t, or w.
 * @author Sean A. Irvine
 */
public class A073419 extends NoncomputableSequence {

  // This sequence is not very rigorous for n > 5.

  /** Construct the sequence. */
  public A073419() {
    super(1, NONCOMPUTABLE, 5, 6, 7, 9, 11, 55555, 66666, 77777, 99999, 555555, 666666, 777777, 999999, 5555555, 6666666, 7777777, 9999999, 555555555, 666666666, 777777777, 999999999, 1111111111, 55555555555L, 66666666666L, 77777777777L, 99999999999L);
  }
}

