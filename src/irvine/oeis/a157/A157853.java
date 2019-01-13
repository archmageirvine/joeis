package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157853.
 * @author Sean A. Irvine
 */
public class A157853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157853() {
    super(new long[] {1, -3, 3}, new long[] {2177, 11376, 27775});
  }
}
