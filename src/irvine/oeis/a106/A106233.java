package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106233 An inverse Catalan transform of A003462.
 * @author Sean A. Irvine
 */
public class A106233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106233() {
    super(new long[] {-3, 6, -7, 4}, new long[] {0, 1, 3, 5});
  }
}
