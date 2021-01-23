package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288486 Square rings obtained by adding four identical cuboids from A169938, a(n) = 4*n*(n+1)*(n*(n+1)+1).
 * @author Sean A. Irvine
 */
public class A288486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288486() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 24, 168, 624, 1680});
  }
}
