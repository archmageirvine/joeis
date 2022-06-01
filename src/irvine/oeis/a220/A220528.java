package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220528 n^7 + 7n + 7^n.
 * @author Sean A. Irvine
 */
public class A220528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220528() {
    super(new long[] {7, -57, 204, -420, 546, -462, 252, -84, 15}, new long[] {1, 15, 191, 2551, 18813, 94967, 397627, 1647135, 7862009});
  }
}
