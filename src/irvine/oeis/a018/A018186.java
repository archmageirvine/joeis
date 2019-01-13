package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018186.
 * @author Sean A. Irvine
 */
public class A018186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018186() {
    super(new long[] {1, 0, 3, 0}, new long[] {1, 3, 6, 9});
  }
}
