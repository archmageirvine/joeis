package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106201.
 * @author Sean A. Irvine
 */
public class A106201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106201() {
    super(new long[] {-4, 0, -1, 2}, new long[] {0, 1, 1, 1});
  }
}
