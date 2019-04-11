package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254468 <code>a(n) = 35*4^n + 126*2^n + 70*3^n + 15*5^n + 5*6^n + 7^n + 210</code>.
 * @author Sean A. Irvine
 */
public class A254468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254468() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {462, 924, 2508, 8646, 35112, 159654, 787968});
  }
}
