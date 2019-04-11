package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036290 <code>a(n) = n*3^n</code>.
 * @author Sean A. Irvine
 */
public class A036290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036290() {
    super(new long[] {-9, 6}, new long[] {0, 3});
  }
}
