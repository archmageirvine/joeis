package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145718 Numbers x such that there exists n in N with (x+127)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145718() {
    super(1, new long[] {1, -2031, 2031}, new long[] {762, 1676527, 3403477826L});
  }
}
