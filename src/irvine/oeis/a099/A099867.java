package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099867 <code>a(n) = 5*a(n-1) - a(n-2)</code> for <code>n&gt;1, a(0)=1, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A099867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099867() {
    super(new long[] {-1, 5}, new long[] {1, 9});
  }
}
