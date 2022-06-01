package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175603 a(n) = 8*(10^n-5).
 * @author Sean A. Irvine
 */
public class A175603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175603() {
    super(new long[] {-10, 11}, new long[] {40, 760});
  }
}
