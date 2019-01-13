package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106249.
 * @author Sean A. Irvine
 */
public class A106249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106249() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 0, 1, 2, 3});
  }
}
