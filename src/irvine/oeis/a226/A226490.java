package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226490 <code>a(n) = n*(19*n-15)/2</code>.
 * @author Sean A. Irvine
 */
public class A226490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226490() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 23});
  }
}
