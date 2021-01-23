package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098149 a(0)=-1, a(1)=-1, a(n)=-3*a(n-1)-a(n-2) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A098149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098149() {
    super(new long[] {-1, -3}, new long[] {-1, -1});
  }
}
