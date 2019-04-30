package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078338 Let <code>u(1)=u(2)=u(3)=1</code> and <code>u(n)=(-1)^n*sign(u(n-1)-u(n-2))*u(n-3)</code>, then <code>a(n)=sum(k=1,n,u(k))</code>.
 * @author Sean A. Irvine
 */
public class A078338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078338() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 3, 4, 5, 5, 4, 5, 5});
  }
}
