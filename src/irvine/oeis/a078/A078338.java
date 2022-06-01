package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078338 Let u(1)=u(2)=u(3)=1 and u(n)=(-1)^n*sign(u(n-1)-u(n-2))*u(n-3), then a(n)=sum(k=1,n,u(k)).
 * @author Sean A. Irvine
 */
public class A078338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078338() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 3, 4, 5, 5, 4, 5, 5});
  }
}
