package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076817 Let u(1)=u(2)=1, u(n)=(3^floor(u(n-1)/2)+1)/u(n-2); then a(n)=10*u(n).
 * @author Sean A. Irvine
 */
public class A076817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076817() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {10, 10, 20, 40, 50, 25, 8, 8, 25, 50, 40});
  }
}
