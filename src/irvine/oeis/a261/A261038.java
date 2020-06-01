package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261038 <code>a(1)=1;</code> for <code>n&gt;1: a(n) = a(n-1)*n</code> if <code>t=0, a(n) = round(a(n-1)/n)</code> if <code>t=1, a(n) = a(n-1)+n</code> if <code>t=2, a(n) = a(n-1)-n</code> if <code>t=3</code>, where t <code>= n mod 4</code>.
 * @author Sean A. Irvine
 */
public class A261038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261038() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 3, 0, 0, 0, 6, -1, -8, -1, 9, -2, -24});
  }
}
