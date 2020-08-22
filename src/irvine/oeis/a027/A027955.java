package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027955 a(n) = T(2n+1, n+3), T given by A027948.
 * @author Sean A. Irvine
 */
public class A027955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027955() {
    super(new long[] {-1, 9, -34, 71, -90, 71, -34, 9}, new long[] {7, 92, 591, 2683, 9955, 32551, 98086, 280271}, 1);
  }
}
