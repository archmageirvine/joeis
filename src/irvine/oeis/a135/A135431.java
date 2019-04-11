package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135431 <code>a(n) = a(n-1) + a(n-2) + a(n-3) - a(n-4)</code> with <code>a(0)=0, a(1)=1, a(2)=2</code> and <code>a(3)=3</code>.
 * @author Sean A. Irvine
 */
public class A135431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135431() {
    super(new long[] {-1, 1, 1, 1}, new long[] {0, 1, 2, 3});
  }
}
