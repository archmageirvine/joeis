package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145306 Numbers n such that there exists x in N : <code>(x+79)^3-x^3=n^2</code>.
 * @author Sean A. Irvine
 */
public class A145306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145306() {
    super(new long[] {-1, 456302}, new long[] {118579, 54107716279L});
  }
}
