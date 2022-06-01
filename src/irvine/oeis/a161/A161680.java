package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161680 a(n) = binomial(n,2): number of size-2 subsets of {0,1,...,n} that contain no consecutive integers.
 * @author Sean A. Irvine
 */
public class A161680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161680() {
    super(new long[] {1, -3, 3}, new long[] {0, 0, 1});
  }
}
