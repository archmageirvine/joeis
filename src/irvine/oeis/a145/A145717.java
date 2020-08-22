package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145717 Numbers n such that there exists x in N with (x+127)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145717() {
    super(new long[] {-1, 2030}, new long[] {16129, 32725741});
  }
}
