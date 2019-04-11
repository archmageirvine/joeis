package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268896 Start at <code>a(0)=1</code>. <code>a(n) = a(n-1)+2</code> if <code>n == 1,2 (mod 3)</code> and <code>a(n)=a(n-1)+a(n-3)</code> if <code>n == 0 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A268896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268896() {
    super(new long[] {-2, 0, 0, 3, 0, 0}, new long[] {1, 3, 5, 6, 8, 10});
  }
}
