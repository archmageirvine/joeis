package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135301 <code>a(1)=1, a(n)=a(n-1)+n^0</code> if n odd, <code>a(n)=a(n-1)+ n^2</code> if n is even.
 * @author Sean A. Irvine
 */
public class A135301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135301() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 6, 22, 23, 59, 60});
  }
}
