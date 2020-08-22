package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254466 a(n) = 56*2^n + 20*4^n + 35*3^n + 4*6^n + 10*5^n + 7^n + 84.
 * @author Sean A. Irvine
 */
public class A254466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254466() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {210, 462, 1386, 5214, 22770, 110022, 571626});
  }
}
