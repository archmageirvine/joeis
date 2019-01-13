package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106855.
 * @author Sean A. Irvine
 */
public class A106855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106855() {
    super(new long[] {-3, 1, 0}, new long[] {1, 0, 1});
  }
}
