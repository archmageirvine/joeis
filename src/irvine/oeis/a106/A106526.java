package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106526.
 * @author Sean A. Irvine
 */
public class A106526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106526() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {4, 6, 14, 30, 40, 84});
  }
}
