package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081660 n+A001045(n+1).
 * @author Sean A. Irvine
 */
public class A081660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081660() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 2, 5, 8});
  }
}
