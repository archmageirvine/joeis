package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145717 Numbers k such that there exists x in N with (x+127)^3-x^3=k^2.
 * @author Sean A. Irvine
 */
public class A145717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145717() {
    super(1, new long[] {-1, 2030}, new long[] {16129, 32725741});
  }
}
