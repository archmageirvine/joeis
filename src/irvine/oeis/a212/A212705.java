package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212705 a(n) is the difference between numbers of nonnegative multiples of 2*n+1 with even and odd digit sum in base 2*n in interval [0, (2*n)^8).
 * @author Sean A. Irvine
 */
public class A212705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212705() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {54, 3220, 38794, 237832, 995710, 3256540, 8954258, 21645200});
  }
}
