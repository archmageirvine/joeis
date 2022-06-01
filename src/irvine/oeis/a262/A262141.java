package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262141 The first of nine consecutive positive integers the sum of the squares of which is equal to the sum of the squares of ten consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262141() {
    super(new long[] {1, -39, 39}, new long[] {181, 7021, 266761});
  }
}
