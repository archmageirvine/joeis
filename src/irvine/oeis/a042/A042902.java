package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042902 Numerators of continued fraction convergents to <code>sqrt(983)</code>.
 * @author Sean A. Irvine
 */
public class A042902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042902() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 568176, 0, 0, 0, 0, 0, 0, 0}, new long[] {31, 63, 94, 533, 16617, 83618, 100235, 284088, 17713691, 35711470, 53425161, 302837275, 9441380686L, 47509740705L, 56951121391L, 161411983487L});
  }
}
