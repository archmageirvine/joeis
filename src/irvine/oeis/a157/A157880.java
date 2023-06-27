package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157880 Expansion of 136*x^2 / (-x^3+1155*x^2-1155*x+1).
 * @author Sean A. Irvine
 */
public class A157880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157880() {
    super(1, new long[] {1, -1155, 1155}, new long[] {0, 136, 157080});
  }
}
