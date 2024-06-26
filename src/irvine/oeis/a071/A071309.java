package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-04-22/lambdan at 2024-04-22 22:28

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A071309 a(n) = (1/2) * (number of n X n 0..10 matrices with MM' mod 11 = I).
 * @author Georg Fischer
 */
public class A071309 extends LambdaSequence {

  /** Construct the sequence. */
  public A071309() {
    super(1, n -> {
      final Z p = Z.valueOf(11);
      final int k = n / 2;
      return p.pow(k).add((n & 1) == 1 ? Z.ZERO : Z.NEG_ONE.pow(k + 1)).multiply(Integers.SINGLETON.product((n & 1) == 1 ? 0 : 1, k - 1, i -> p.pow(2 * k).subtract(p.pow(2L * i))));
    });
  }
}
