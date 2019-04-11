package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206526 <code>a(n) = 137*(n-1) - a(n-1)</code> with <code>n&gt;1, a(1)=31</code>.
 * @author Sean A. Irvine
 */
public class A206526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206526() {
    super(new long[] {-1, 1, 1}, new long[] {31, 106, 168});
  }
}
