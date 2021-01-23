package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017317 a(n) = 10n + 4.
 * @author Sean A. Irvine
 */
public class A017317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017317() {
    super(new long[] {-1, 2}, new long[] {4, 14});
  }
}
