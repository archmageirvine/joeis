package irvine.oeis.a345;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A345040 a(n) = Sum_{k=0..n} Stirling2(n,k)^k.
 * a(n) = sum(k=0,n,stirl(n,k,2)^k)
 * @author Georg Fischer
 */
public class A345040 extends LambdaSequence {

  /** Construct the sequence. */
  public A345040() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Functions.STIRLING2.z(n, k).pow(k)));
  }
}
