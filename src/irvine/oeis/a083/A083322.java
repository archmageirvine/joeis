package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083322 <code>a(n) = 2^n -</code> A081374(n).
 * @author Sean A. Irvine
 */
public class A083322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083322() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, 2, 6, 11});
  }
}
