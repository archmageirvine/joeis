package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042651.
 * @author Sean A. Irvine
 */
public class A042651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042651() {
    super(new long[] {-1, 0, 0, 0, 6082, 0, 0, 0}, new long[] {1, 4, 25, 104, 6057, 24332, 152049, 632528});
  }
}
