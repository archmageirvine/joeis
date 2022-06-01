package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145528 Numbers x such that (x+91)^3 - x^3 is a square.
 * @author Sean A. Irvine
 */
public class A145528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145528() {
    super(new long[] {1, -1455, 1455}, new long[] {455, 728182, 1058842239});
  }
}
