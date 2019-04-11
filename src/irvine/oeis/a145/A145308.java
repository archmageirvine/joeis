package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145308 Numbers n such that there exists x in N : <code>(x+1)^3-x^3=79*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145308() {
    super(new long[] {-1, 456302}, new long[] {19, 8669719});
  }
}
