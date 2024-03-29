package irvine.oeis.a358;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A358732 Number of labeled trees covering 2n nodes, half of which are leaves.
 * a(n) = stirl(2*n-2,n,2)*(2*n)!/n!
 * @author Georg Fischer
 */
public class A358732 extends LambdaSequence {

  /** Construct the sequence. */
  public A358732() {
    super(1, n -> Stirling.secondKind(2L * n - 2, n).multiply(MemoryFactorial.SINGLETON.factorial(2 * n)).divide(MemoryFactorial.SINGLETON.factorial(n)));
  }
}
