package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109534 a(0)=1, a(n)=n+a(n-1) if n mod 2=0, a(n)=3n-a(n-1) if n mod 2 = 1.
 * @author Sean A. Irvine
 */
public class A109534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109534() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 2, 4, 5, 9, 6});
  }
}
