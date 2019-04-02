package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174562 a(1)=2, a(2)=3, then a(n)=a(n-1)+a(n-2) if n odd, a(n)=a(n-1)-a(n-2) if n even.
 * @author Sean A. Irvine
 */
public class A174562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174562() {
    super(new long[] {1, 0, 1, 0}, new long[] {2, 3, 5, 2});
  }
}
