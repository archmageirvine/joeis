package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145697 Numbers n such that there exists x in N with <code>(x+37)^3-x^3=n^2</code>.
 * @author Sean A. Irvine
 */
public class A145697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145697() {
    super(new long[] {-1, 590}, new long[] {1369, 806341});
  }
}
