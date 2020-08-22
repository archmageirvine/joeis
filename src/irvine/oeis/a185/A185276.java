package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185276 Kronecker symbol (-100 / n).
 * @author Sean A. Irvine
 */
public class A185276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185276() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, -1, 0, 0, 0, -1, 0, 1, 0});
  }
}
