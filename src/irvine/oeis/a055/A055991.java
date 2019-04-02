package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055991 a(n) is its own 4th difference.
 * @author Sean A. Irvine
 */
public class A055991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055991() {
    super(new long[] {-1, 4, -6, 5}, new long[] {1, 5, 19, 69});
  }
}
