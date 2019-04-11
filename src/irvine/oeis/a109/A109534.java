package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109534 <code>a(0)=1, a(n)=n+a(n-1)</code> if <code>n mod 2=0, a(n)=3n-a(n-1)</code> if <code>n mod 2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A109534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109534() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 2, 4, 5, 9, 6});
  }
}
