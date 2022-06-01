package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221175 a(0)=-5, a(1)=6; thereafter a(n) = 2*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A221175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221175() {
    super(new long[] {1, 2}, new long[] {-5, 6});
  }
}
