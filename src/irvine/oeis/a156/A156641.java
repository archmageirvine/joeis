package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156641 a(n) = 13*(100^(n+1) - 1)/99.
 * @author Sean A. Irvine
 */
public class A156641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156641() {
    super(new long[] {-100, 101}, new long[] {13, 1313});
  }
}
