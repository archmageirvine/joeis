package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190991 a(n) = 13*n + 1.
 * @author Sean A. Irvine
 */
public class A190991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190991() {
    super(new long[] {-1, 2}, new long[] {1, 14});
  }
}
