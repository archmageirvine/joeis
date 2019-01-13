package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106157.
 * @author Sean A. Irvine
 */
public class A106157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106157() {
    super(new long[] {2, -1, -4, 2, 2}, new long[] {-1, -1, -2, -1, -2});
  }
}
