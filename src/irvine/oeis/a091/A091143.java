package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091143 Number of Pythagorean triples mod 2^n; i.e., number of solutions to x^2 + y^2 = z^2 mod 2^n.
 * @author Sean A. Irvine
 */
public class A091143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091143() {
    super(new long[] {-32, 8, 4}, new long[] {1, 4, 24});
  }
}
