package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074607 <code>a(n) = 3^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074607() {
    super(new long[] {-18, 9}, new long[] {2, 9});
  }
}
