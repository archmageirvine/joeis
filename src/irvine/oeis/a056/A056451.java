package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056451 Number of palindromes using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056451() {
    super(new long[] {5, 0}, new long[] {1, 5});
  }
}
