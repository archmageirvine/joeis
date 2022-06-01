package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082296 Solutions to 13^x+17^x == 19 mod 23.
 * @author Sean A. Irvine
 */
public class A082296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082296() {
    super(new long[] {-1, 1, 1}, new long[] {12, 20, 34});
  }
}
