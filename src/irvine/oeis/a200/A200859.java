package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200859 <code>a(n) = 2*a(n-1)+3*a(n-2)+5^n</code> for <code>n&gt;1, a(0)=-2, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A200859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200859() {
    super(new long[] {-15, -7, 7}, new long[] {-2, 1, 21});
  }
}
