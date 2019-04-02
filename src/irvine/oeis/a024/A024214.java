package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024214 a(n) = 4th elementary symmetric function of first n+3 positive integers congruent to 1 mod 3.
 * @author Sean A. Irvine
 */
public class A024214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024214() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {280, 5714, 45474, 227969, 859369, 2662569, 7141953, 17147823, 37702863});
  }
}
