package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292521 <code>a(n) = a(n-2) - 2a(n-3) + a(n-4)</code> for <code>n&gt;3,</code> with <code>a(0)=2, a(1)=0, a(2)=1, a(3)=-1, a</code> sequence related to Pellian numbers.
 * @author Sean A. Irvine
 */
public class A292521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292521() {
    super(new long[] {1, -2, 1, 0}, new long[] {2, 0, 1, -1});
  }
}
