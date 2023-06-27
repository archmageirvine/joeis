package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106832 4*n-2 and 6*n alternatively.
 * @author Sean A. Irvine
 */
public class A106832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106832() {
    super(1, new long[] {-1, 0, 2, 0}, new long[] {2, 6, 6, 12});
  }
}
