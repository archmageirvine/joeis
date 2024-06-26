package irvine.oeis.a187;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A187748 Determinant of the n X n matrix m_(i,j) = gcd(2^i-1, 2^j-1).
 * a(n) = (1/2)*prod(k=1,n,sumdiv(k,d,moebius(d)*2^(k/d)))
 * @author Georg Fischer
 */
public class A187748 extends LambdaSequence {

  /** Construct the sequence. */
  public A187748() {
    super(1, n -> Integers.SINGLETON.product(1, n, k -> Integers.SINGLETON.sumdiv(k, d -> Z.valueOf(Functions.MOBIUS.i(d)).multiply(Z.ONE.shiftLeft(k / d)))).divide2());
  }
}
