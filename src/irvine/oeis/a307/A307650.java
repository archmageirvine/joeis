package irvine.oeis.a307;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A307650 Number of regions in the Shi-threshold arrangement STn.
 * a(n) = sum(j=0,n,binom(2*j+1,j)*j!*(-1)^(n-j)*stirl(n,j,2)) + 2*n*sum(j=0,n-1,binom(2*j+2,j)*j!*(-1)^(n-j)*stirl(n-1,j,2)) + n*(n-1)*sum(j=0,n-2,binom(2*j+3,j)*j!*(-1)^(n-j)*stirl(n-2,j,2));
 * @author Georg Fischer
 */
public class A307650 extends LambdaSequence {

  /** Construct the sequence. */
  public A307650() {
    super(0, n -> Integers.SINGLETON.sum(0, n, j -> Binomial.binomial(2L * j + 1, j).multiply(Functions.FACTORIAL.z(j)).multiply(Z.NEG_ONE.pow(n - j)).multiply(Functions.STIRLING2.z(n, j))).add(Z.TWO.multiply(n).multiply(Integers.SINGLETON.sum(0, n - 1, j -> Binomial.binomial(2L * j + 2, j).multiply(Functions.FACTORIAL.z(j)).multiply(Z.NEG_ONE.pow(n - j)).multiply(Functions.STIRLING2.z(n - 1, j))))).add(Z.valueOf(n).multiply(Z.valueOf(n - 1)).multiply(Integers.SINGLETON.sum(0, n - 2, j -> Binomial.binomial(2L * j + 3, j).multiply(Functions.FACTORIAL.z(j)).multiply(Z.NEG_ONE.pow(n - j)).multiply(Functions.STIRLING2.z(n - 2, j))))));
  }
}
