package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113841 <code>a(n) = a(n-1) +</code> 2^A047240(n) for <code>n&gt;1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A113841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113841() {
    super(new long[] {-64, 64, 0, 1}, new long[] {1, 3, 7, 71});
  }
}
