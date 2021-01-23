package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016782 a(n) = (3*n+1)^6.
 * @author Sean A. Irvine
 */
public class A016782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016782() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 4096, 117649, 1000000, 4826809, 16777216, 47045881});
  }
}
