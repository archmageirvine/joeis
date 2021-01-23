package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084128 a(n) = 4*a(n-1) + 4*a(n-2), a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A084128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084128() {
    super(new long[] {4, 4}, new long[] {1, 2});
  }
}
