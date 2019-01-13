package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164136.
 * @author Sean A. Irvine
 */
public class A164136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164136() {
    super(new long[] {1, -3, 3}, new long[] {0, 22, 66});
  }
}
