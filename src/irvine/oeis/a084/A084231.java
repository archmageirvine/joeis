package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084231 Numbers n such that root-mean-square value of <code>1, 2, </code>..., <code>n,</code> sqrt(Sum(k^2, k, <code>1, n)/n),</code> is <code>an</code> integer.
 * @author Sean A. Irvine
 */
public class A084231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084231() {
    super(new long[] {1, -195, 195}, new long[] {1, 337, 65521});
  }
}
