package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007484 <code>a(n) = 3*a(n-1) + 2*a(n-2),</code> with <code>a(0)=2, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A007484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007484() {
    super(new long[] {2, 3}, new long[] {2, 7});
  }
}
