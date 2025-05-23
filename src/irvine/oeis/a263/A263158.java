package irvine.oeis.a263;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A263158 a(n) = Sum_{k=1..n} Stirling2(n,k)*(k!)^3.
 * a(n)=sum(k=1,n,stirl2(n,k)*((k)!)^3)
 * @author Georg Fischer
 */
public class A263158 extends LambdaSequence {

  /** Construct the sequence. */
  public A263158() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.STIRLING2.z(n, k).multiply(Functions.FACTORIAL.z(k).pow(Z.THREE))));
  }
}
