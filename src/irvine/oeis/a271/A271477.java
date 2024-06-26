package irvine.oeis.a271;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A271477 Total number of burnt pancakes flipped using the Max-bar(n) greedy algorithm.
 * a(n) = n * 2^n * n!/2  + sum(k=1,n-1,(2*k+1) * k * 2^k * k!/2);
 * @author Georg Fischer
 */
public class A271477 extends LambdaSequence {

  /** Construct the sequence. */
  public A271477() {
    super(1, n -> Z.valueOf(n).multiply(Z.ONE.shiftLeft(n)).multiply(Functions.FACTORIAL.z(n)).divide(Z.TWO).add(Integers.SINGLETON.sum(1, n - 1, k -> Z.valueOf(2L * k + 1).multiply(k).multiply(Z.ONE.shiftLeft(k)).multiply(Functions.FACTORIAL.z(k)).divide(Z.TWO))));
  }
}
