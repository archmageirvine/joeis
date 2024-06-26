package irvine.oeis.a286;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A286038 Number of (undirected) paths in the n-cocktail party graph.
 * a(n) = (-2*n-1 + sum(j=0,n,sum(k=2*j,2*n,(-1)^j*2^j*(k-j)! * binom(n,j) * binom(2*n-2*j,k-2*j))) )/2;
 * @author Georg Fischer
 */
public class A286038 extends LambdaSequence {

  /** Construct the sequence. */
  public A286038() {
    super(1, n -> (Z.TWO.negate()).multiply(n).subtract(Z.ONE).add(Integers.SINGLETON.sum(0, n, j -> Integers.SINGLETON.sum(2 * j, 2 * n, k -> Z.NEG_ONE.pow(j).multiply(Z.ONE.shiftLeft(j)).multiply(Functions.FACTORIAL.z(k - j)).multiply(Binomial.binomial(n, j)).multiply(Binomial.binomial(2L * n - 2L * j, k - 2L * j))))).divide(Z.TWO));
  }
}
