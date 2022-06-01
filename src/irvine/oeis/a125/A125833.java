package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125833 Numbers whose base 5 representation is 333333.......3.
 * @author Sean A. Irvine
 */
public class A125833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125833() {
    super(new long[] {-5, 6}, new long[] {0, 3});
  }
}
