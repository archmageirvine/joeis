package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155754 A variation on 10^n mod 19.
 * @author Sean A. Irvine
 */
public class A155754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155754() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, -9, 5, -7, 6, 3, -8, -4, -2});
  }
}
