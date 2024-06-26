package irvine.oeis.a100;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A100735 Inverse modulo 2 binomial transform of 2^n.
 * @author Georg Fischer
 */
public class A100735 extends LambdaSequence {

  // a(n) = Sum{k=0..n} (-1)^A010060(n-k)*mod(binomial(n, k), 2)*2^k.

  /** Construct the sequence. */
  public A100735() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base base in final factor
   */
  public A100735(final int offset, final int base) {
    super(offset, n -> Integers.SINGLETON.sum(0, n, k -> (Functions.THUE_MORSE.z(n - k).testBit(0) ? Z.NEG_ONE : Z.ONE)
      .multiply(Binomial.binomial(n, k).and(Z.ONE)).multiply(Z.valueOf(base).pow(k))));
  }
}
