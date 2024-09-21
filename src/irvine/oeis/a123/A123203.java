package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123203 a(n) = 2^(n+1) - 3*n.
 * @author Sean A. Irvine
 */
public class A123203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123203() {
    super(1, new long[] {2, -5, 4}, new long[] {1, 2, 7});
  }
}
