package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127220 <code>a(n) = 3^n*tetranacci(n)</code> or <code>(2^n)*A001648(n)</code>.
 * @author Sean A. Irvine
 */
public class A127220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127220() {
    super(new long[] {81, 27, 9, 3}, new long[] {3, 27, 189, 1215});
  }
}
