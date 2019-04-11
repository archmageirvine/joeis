package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271388 <code>a(n) = 4*a(n-1) + a(n-2) - n</code> for <code>n&gt;1,</code> with <code> a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A271388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271388() {
    super(new long[] {1, 2, -8, 6}, new long[] {0, 1, 2, 6});
  }
}
