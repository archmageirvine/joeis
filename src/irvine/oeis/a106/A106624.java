package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106624.
 * @author Sean A. Irvine
 */
public class A106624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106624() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 0, 2, 1});
  }
}
