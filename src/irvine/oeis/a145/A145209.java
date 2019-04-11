package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145209 Numbers x such that <code>(x+67)^3-x^3</code> is a square.
 * @author Sean A. Irvine
 */
public class A145209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145209() {
    super(new long[] {1, -1030191, 1030191}, new long[] {9782, 10111839727L, 10417116202859646L});
  }
}
