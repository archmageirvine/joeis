package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073937 a(n)=a(n-1)-a(n-2)+a(n-3)+a(n-4), a(0)=4, a(1)=1, a(2)=-1, a(3)=1.
 * @author Sean A. Irvine
 */
public class A073937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073937() {
    super(new long[] {1, 1, -1, 1}, new long[] {4, 1, -1, 1});
  }
}
