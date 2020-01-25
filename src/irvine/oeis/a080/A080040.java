package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080040 <code>a(n) = 2*a(n-1) + 2*a(n-2)</code> for <code>n &gt; 1; a(0)=2, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A080040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080040() {
    super(new long[] {2, 2}, new long[] {2, 2});
  }
}
