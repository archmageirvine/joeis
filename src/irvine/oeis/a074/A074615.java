package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074615 a(n) = 5^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074615() {
    super(new long[] {-30, 11}, new long[] {2, 11});
  }
}
