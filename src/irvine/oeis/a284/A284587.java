package irvine.oeis.a284;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A284587 Sum of the divisors of n that are not divisible by 13.
 * @author Georg Fischer
 */
public class A284587 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A284587() {
    super(1, (p, e) -> p.equals(13) ? Z.ONE : p.pow(e + 1).subtract(1).divide(p.subtract(1)));
  }
}
