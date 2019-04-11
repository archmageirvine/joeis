package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145529 Numbers n such that there exists x in N : <code>(x+1)^3-x^3=91*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145529() {
    super(new long[] {-1, 1454}, new long[] {1, 1453});
  }
}
