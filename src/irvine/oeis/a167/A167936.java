package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167936 <code>2^n - A108411(n)</code>.
 * @author Sean A. Irvine
 */
public class A167936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167936() {
    super(new long[] {-6, 3, 2}, new long[] {0, 1, 1});
  }
}
