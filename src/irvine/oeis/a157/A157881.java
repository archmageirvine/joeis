package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157881 Expansion of 152*x^2 / (-x^3+1443*x^2-1443*x+1).
 * @author Sean A. Irvine
 */
public class A157881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157881() {
    super(1, new long[] {1, -1443, 1443}, new long[] {0, 152, 219336});
  }
}
