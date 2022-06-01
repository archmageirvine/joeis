package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024386 [ (3rd elementary symmetric function of S(n))/(first elementary symmetric function of S(n)) ], where S(n) = {first n+2 positive integers congruent to 1 mod 4}.
 * @author Sean A. Irvine
 */
public class A024386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024386() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 29, 114, 310, 685});
  }
}
