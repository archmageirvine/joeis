package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157853 3600n^2 - 1601n + 178.
 * @author Sean A. Irvine
 */
public class A157853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157853() {
    super(new long[] {1, -3, 3}, new long[] {2177, 11376, 27775});
  }
}
