package irvine.oeis.a167;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A167559 The row sums of triangle A167557.
 * a(n)=sum(m=1,n,(4^(m-1)*(m-1)!*(n+m-2)!/(2*m-2)!))
 * @author Georg Fischer
 */
public class A167559 extends LambdaSequence {

  /** Construct the sequence. */
  public A167559() {
    super(1, n -> Integers.SINGLETON.sum(1, n, m -> Z.FOUR.pow(m - 1).multiply(MemoryFactorial.SINGLETON.factorial(m - 1)).multiply(MemoryFactorial.SINGLETON.factorial(n + m - 2)).divide(MemoryFactorial.SINGLETON.factorial(2 * m - 2))));
  }
}
