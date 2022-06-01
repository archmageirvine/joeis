package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175162 a(n) = 16*(2^n + 1).
 * @author Sean A. Irvine
 */
public class A175162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175162() {
    super(new long[] {-2, 3}, new long[] {32, 48});
  }
}
