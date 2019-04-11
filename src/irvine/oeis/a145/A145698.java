package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145698 Numbers x such that <code>(x+37)^3-x^3</code> is a square.
 * @author Sean A. Irvine
 */
public class A145698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145698() {
    super(new long[] {1, -591, 591}, new long[] {111, 76516, 45155207});
  }
}
