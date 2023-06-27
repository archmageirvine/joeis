package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145121 Numbers n such that there exists x in N : (x+19)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145121() {
    super(1, new long[] {-1, 302}, new long[] {361, 108661});
  }
}
