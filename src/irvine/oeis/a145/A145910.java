package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145910 a(n) = (1 + 3*n)*(4 + 3*n)/2.
 * @author Sean A. Irvine
 */
public class A145910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145910() {
    super(new long[] {1, -3, 3}, new long[] {2, 14, 35});
  }
}
