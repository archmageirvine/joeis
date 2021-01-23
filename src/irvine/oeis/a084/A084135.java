package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084135 a(n) = 10*a(n-1) - 15*a(n-2), a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A084135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084135() {
    super(new long[] {-15, 10}, new long[] {1, 5});
  }
}
