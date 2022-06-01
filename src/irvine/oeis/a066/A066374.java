package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066374 (3*n+4)*2^(n-3)-(2*n-1).
 * @author Sean A. Irvine
 */
public class A066374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066374() {
    super(new long[] {-4, 12, -13, 6}, new long[] {2, 8, 25, 67});
  }
}
