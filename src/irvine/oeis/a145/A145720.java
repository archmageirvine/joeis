package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145720 Numbers x such that there exists n in N with <code>(x+1)^3-x^3=127*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145720() {
    super(new long[] {1, -2031, 2031}, new long[] {6, 13201, 26799038});
  }
}
