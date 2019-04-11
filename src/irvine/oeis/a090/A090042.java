package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090042 <code>a(n) = 2*a(n-1) + 11*a(n-2)</code> for <code>n &gt; 1, a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A090042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090042() {
    super(new long[] {11, 2}, new long[] {1, 1});
  }
}
