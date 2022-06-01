package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164367 a(n) = A164051(n) in base 2.
 * @author Sean A. Irvine
 */
public class A164367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164367() {
    super(new long[] {-1000, 110}, new long[] {101, 10010});
  }
}
