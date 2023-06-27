package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145308 Numbers n such that there exists x in N : (x+1)^3-x^3=79*n^2.
 * @author Sean A. Irvine
 */
public class A145308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145308() {
    super(1, new long[] {-1, 456302}, new long[] {19, 8669719});
  }
}
