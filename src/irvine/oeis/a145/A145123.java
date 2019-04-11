package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145123 Numbers n such that there exists x in N : <code>(x+1)^3-x^3=19*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145123() {
    super(new long[] {-1, 302}, new long[] {1, 301});
  }
}
