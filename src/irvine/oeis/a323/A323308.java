package irvine.oeis.a323;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A323308 The number of exponential semiproper divisors of n.
 * @author Georg Fischer
 */
public class A323308 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A323308() {
    super(1, (p, e) -> e == 1 ? Z.ONE : Z.TWO);
  }
}
