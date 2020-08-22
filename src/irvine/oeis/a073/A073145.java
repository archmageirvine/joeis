package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073145 a(n) = -a(n-1) - a(n-2) + a(n-3), a(0)=3, a(1)=-1, a(2)=-1.
 * @author Sean A. Irvine
 */
public class A073145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073145() {
    super(new long[] {1, -1, -1}, new long[] {3, -1, -1});
  }
}
