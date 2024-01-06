package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078339 Let u(1)=u(2)=u(3)=1 and u(n)=(-1)^n*sign(u(n-1)-u(n-2))*u(n-3); then a(n)=sum(k=1,n,sum(i=1,k,u(i))) - 3*(n-1).
 * @author Sean A. Irvine
 */
public class A078339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078339() {
    super(1, new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 1, 3, 5, 6, 8, 10});
  }
}
