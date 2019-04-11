package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074606 <code>a(n) = 3^n + 5^n</code>.
 * @author Sean A. Irvine
 */
public class A074606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074606() {
    super(new long[] {-15, 8}, new long[] {2, 8});
  }
}
