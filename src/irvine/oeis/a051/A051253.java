package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051253 Weights of rotation-symmetric functions in n variables.
 * @author Sean A. Irvine
 */
public class A051253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051253() {
    super(new long[] {-4, -2, 2, 2}, new long[] {1, 4, 6, 18});
  }
}
