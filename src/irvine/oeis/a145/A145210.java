package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145210 Numbers n such that there exists x in N : (x+1)^3-x^3=67*n^2.
 * @author Sean A. Irvine
 */
public class A145210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145210() {
    super(new long[] {-1, 1030190}, new long[] {31, 31935859});
  }
}
