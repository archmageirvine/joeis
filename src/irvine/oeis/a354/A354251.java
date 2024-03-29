package irvine.oeis.a354;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A354251 Expansion of e.g.f. Sum_{k&gt;=0} (3*k)! * (-log(1-x))^k / k!.
 * a(n) = sum(k=0,n,(3*k)!*abs(stirl(n,k,1)));
 * @author Georg Fischer
 */
public class A354251 extends LambdaSequence {

  /** Construct the sequence. */
  public A354251() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> MemoryFactorial.SINGLETON.factorial(3 * k).multiply(Stirling.firstKind(n, k).abs())));
  }
}
