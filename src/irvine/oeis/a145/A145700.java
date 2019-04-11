package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145700 Numbers x such that there exists n in N with <code>(x+1)^3-x^3=37*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145700() {
    super(new long[] {1, -591, 591}, new long[] {3, 2068, 1220411});
  }
}
