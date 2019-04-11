package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079773 <code>a(n) = 2*a(n-1)+15*a(n-2)</code> with <code>n&gt;0, a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A079773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079773() {
    super(new long[] {15, 2}, new long[] {0, 1});
  }
}
