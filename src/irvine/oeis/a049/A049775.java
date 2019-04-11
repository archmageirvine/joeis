package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049775 <code>a(n)</code> is the sum of all integers from <code>2^(n-2)+1</code> to <code>2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A049775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049775() {
    super(new long[] {-8, 6}, new long[] {2, 7});
  }
}
