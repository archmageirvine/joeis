package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145123 Numbers n such that there exists x in N : (x+1)^3-x^3=19*n^2.
 * @author Sean A. Irvine
 */
public class A145123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145123() {
    super(1, new long[] {-1, 302}, new long[] {1, 301});
  }
}
