package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106648 3*n^2+6*n+8.
 * @author Sean A. Irvine
 */
public class A106648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106648() {
    super(new long[] {1, -3, 3}, new long[] {8, 17, 32});
  }
}
