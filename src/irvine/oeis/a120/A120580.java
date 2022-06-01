package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120580 Hankel transform of sum{k=0..n, C(2k,k)}.
 * @author Sean A. Irvine
 */
public class A120580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120580() {
    super(new long[] {-4, 2}, new long[] {1, 0});
  }
}
