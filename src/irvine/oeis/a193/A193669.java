package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193669 Expansion of o.g.f.(1-x^4)/(1-x+x^8).
 * @author Sean A. Irvine
 */
public class A193669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193669() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 0, 0, 0, 0});
  }
}
