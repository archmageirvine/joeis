package irvine.oeis.a192;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A192557  a(n) = sum(stirling2(n,k)*stirling2(n+1,k+1)*k!,k=0..n).
 * a(n)=sum(k=0,n,stirl2(n,k)*stirl2(n+1,k+1)*k!)
 * @author Georg Fischer
 */
public class A192557 extends LambdaSequence {

  /** Construct the sequence. */
  public A192557() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Stirling.secondKind(n, k).multiply(Stirling.secondKind(n + 1, k + 1)).multiply(MemoryFactorial.SINGLETON.factorial(k))));
  }
}
