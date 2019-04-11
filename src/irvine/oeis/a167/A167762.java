package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167762 <code>a(n) = 2*a(n-1)+3*a(n-2)-6*a(n-3)</code> starting <code>a(0)=a(1)=0, a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A167762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167762() {
    super(new long[] {-6, 3, 2}, new long[] {0, 0, 1});
  }
}
