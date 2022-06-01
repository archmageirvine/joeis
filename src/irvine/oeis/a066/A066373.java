package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066373 a(n) = (3*n-2)*2^(n-3).
 * @author Sean A. Irvine
 */
public class A066373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066373() {
    super(new long[] {-4, 4}, new long[] {2, 7});
  }
}
