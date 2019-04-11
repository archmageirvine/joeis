package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175162 <code>a(n) = 16*(2^n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A175162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175162() {
    super(new long[] {-2, 3}, new long[] {32, 48});
  }
}
