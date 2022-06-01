package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130472 A permutation of the integers: a(n) = (-1)^n * floor( (n+1)/2 ).
 * @author Sean A. Irvine
 */
public class A130472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130472() {
    super(new long[] {1, 1, -1}, new long[] {0, -1, 1});
  }
}
