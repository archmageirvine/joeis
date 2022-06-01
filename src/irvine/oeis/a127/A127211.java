package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127211 a(n) = 4^n*Lucas(n), where Lucas = A000204.
 * @author Sean A. Irvine
 */
public class A127211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127211() {
    super(new long[] {16, 4}, new long[] {4, 48});
  }
}
