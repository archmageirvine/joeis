package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074567 <code>a(n) = 4^n + 6^n + 9^n</code>.
 * @author Sean A. Irvine
 */
public class A074567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074567() {
    super(new long[] {216, -114, 19}, new long[] {3, 19, 133});
  }
}
