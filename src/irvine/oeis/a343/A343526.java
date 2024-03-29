package irvine.oeis.a343;
// Generated by gen_seq4.pl mult1/mult at 2022-07-19 18:36

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A343526 Number of divisors of n^7.
 * @author Georg Fischer
 */
public class A343526 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A343526() {
    super(1, (p, e) -> Z.valueOf(7L * e + 1));
  }
}
