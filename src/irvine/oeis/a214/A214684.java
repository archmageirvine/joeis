package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214684 <code>a(1)=1, a(2)=1</code>, and, for <code>n&gt;2, a(n)=(a(n-1)+a(n-2))/5^k</code>, where <code>5^k</code> is the highest power of 5 dividing <code>a(n-1)+a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A214684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214684() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 1, 4});
  }
}
