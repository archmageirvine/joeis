package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084130 a(n) = 8a(n-1)-8a(n-2), a(0)=1, a(1)=4.
 * @author Sean A. Irvine
 */
public class A084130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084130() {
    super(new long[] {-8, 8}, new long[] {1, 4});
  }
}
