package irvine.oeis.a327;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A327091 Number of chiral pairs of length n words with integer entries that cover an initial interval of positive integers.
 * a(n) = sum(k=1,n,k! * (stirl(n,k,2) - stirl((n+1)\2,k,2)) / 2)
 * @author Georg Fischer
 */
public class A327091 extends LambdaSequence {

  /** Construct the sequence. */
  public A327091() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(n, k).subtract(Functions.STIRLING2.z((n + 1) / 2, k))).divide(Z.TWO)));
  }
}
