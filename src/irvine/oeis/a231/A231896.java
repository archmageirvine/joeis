package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231896.
 * @author Sean A. Irvine
 */
public class A231896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231896() {
    super(new long[] {-1, 4}, new long[] {0, 4});
  }
}
