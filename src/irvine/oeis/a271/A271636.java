package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271636.
 * @author Sean A. Irvine
 */
public class A271636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271636() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 28, 152, 468});
  }
}
