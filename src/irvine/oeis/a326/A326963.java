package irvine.oeis.a326;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A326963 Number of length n arrays with entries that cover an initial interval of positive integers counting chiral pairs as equivalent, i.e., the arrays are reversible.
 * a(n) = sum(k=0,n,k! * (stirl(n,k,2) + stirl((n+1)\2,k,2)) / 2)
 * @author Georg Fischer
 */
public class A326963 extends LambdaSequence {

  /** Construct the sequence. */
  public A326963() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(n, k).add(Functions.STIRLING2.z((n + 1) / 2, k))).divide(Z.TWO)));
  }
}
