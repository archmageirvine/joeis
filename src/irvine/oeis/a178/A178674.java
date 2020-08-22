package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178674 a(n) = 3^n + 3.
 * @author Sean A. Irvine
 */
public class A178674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178674() {
    super(new long[] {-3, 4}, new long[] {4, 6});
  }
}
