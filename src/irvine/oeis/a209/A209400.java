package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209400 Number of subsets of {1,...,n} containing a subset of the form {k,k+1,k+3} for some k.
 * @author Sean A. Irvine
 */
public class A209400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209400() {
    super(new long[] {-2, -1, 1, -2, -1, 3}, new long[] {0, 0, 0, 0, 2, 7});
  }
}
