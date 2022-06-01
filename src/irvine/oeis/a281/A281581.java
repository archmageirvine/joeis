package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281581 a(n) = (15*2^(2*n+2) + 15*2^(n+2) + 5*2^(n+3)*3^(n+1) - 24*5^(n+1))/120.
 * @author Sean A. Irvine
 */
public class A281581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281581() {
    super(new long[] {-240, 268, -104, 17}, new long[] {1, 4, 21, 127});
  }
}
