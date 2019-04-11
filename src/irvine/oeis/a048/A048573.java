package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048573 <code>a(n) = a(n-1) + 2*a(n-2), a(0)=2, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A048573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048573() {
    super(new long[] {2, 1}, new long[] {2, 3});
  }
}
