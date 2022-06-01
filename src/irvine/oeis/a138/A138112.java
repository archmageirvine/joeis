package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138112 a(n)=3a(n-1)-4a(n-2)+2a(n-3)-a(n-4), a(0)=a(1)=a(2)=0, a(3)=1, a(4)=3.
 * @author Sean A. Irvine
 */
public class A138112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138112() {
    super(new long[] {-1, 2, -4, 3}, new long[] {0, 0, 0, 1});
  }
}
