package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130652 a(n) = 11^n - 2.
 * @author Sean A. Irvine
 */
public class A130652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130652() {
    super(new long[] {-11, 12}, new long[] {9, 119});
  }
}
