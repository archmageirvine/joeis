package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056579 1+2n+3n^2+4n^3+5n^4.
 * @author Sean A. Irvine
 */
public class A056579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056579() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 15, 129, 547, 1593});
  }
}
