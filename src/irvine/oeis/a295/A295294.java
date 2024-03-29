package irvine.oeis.a295;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A295294 Sum of the divisors of the powerful part of n: a(n) = A000203(A057521(n)).
 * @author Georg Fischer
 */
public class A295294 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A295294() {
    super(1, (p, e) -> e == 1 ? Z.ONE : p.pow(e + 1).subtract(1).divide(p.subtract(1)));
  }
}
