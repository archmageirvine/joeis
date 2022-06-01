package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145304 Numbers X such that there exists Y in N : X^2=237*Y^2+79.
 * @author Sean A. Irvine
 */
public class A145304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145304() {
    super(new long[] {-1, 456302}, new long[] {3002, 1369815602});
  }
}
