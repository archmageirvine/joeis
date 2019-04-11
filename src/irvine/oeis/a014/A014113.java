package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014113 <code>a(n) = a(n-1) + 2*a(n-2)</code> with <code>a(0)=0, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A014113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014113() {
    super(new long[] {2, 1}, new long[] {0, 2});
  }
}
