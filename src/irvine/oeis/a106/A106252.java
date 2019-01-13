package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106252.
 * @author Sean A. Irvine
 */
public class A106252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106252() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 3, 5, 7, 8});
  }
}
