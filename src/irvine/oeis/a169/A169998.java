package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169998 a(0)=1, a(1)=1; thereafter a(n) = -a(n-1) - 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A169998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169998() {
    super(new long[] {-2, -1}, new long[] {1, 1});
  }
}
