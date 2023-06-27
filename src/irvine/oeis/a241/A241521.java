package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241521 Numbers n such that n^2 == -1 (mod 97).
 * @author Sean A. Irvine
 */
public class A241521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241521() {
    super(1, new long[] {-1, 1, 1}, new long[] {22, 75, 119});
  }
}
