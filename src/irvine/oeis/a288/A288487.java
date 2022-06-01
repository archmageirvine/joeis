package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288487 Cuboids that fit in square rings from A288486 obtaining a fifth power.
 * @author Sean A. Irvine
 */
public class A288487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288487() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 8, 75, 400, 1445, 4056});
  }
}
