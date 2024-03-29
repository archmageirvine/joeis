package irvine.oeis.a111;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A111682 a(n) = (2n)^(2n) - (2n-1)!*(3n)!/((n-1)!*(2n)!).
 * a(n)=(2*n)^(2*n) - (2*n-1)!*(3*n)!/((n-1)!*(2*n)!)
 * @author Georg Fischer
 */
public class A111682 extends LambdaSequence {

  /** Construct the sequence. */
  public A111682() {
    super(1, n -> Z.valueOf(2L * n).pow(2L * n).subtract(MemoryFactorial.SINGLETON.factorial(2 * n - 1).multiply(MemoryFactorial.SINGLETON.factorial(3 * n)).divide(MemoryFactorial.SINGLETON.factorial(n - 1).multiply(MemoryFactorial.SINGLETON.factorial(2 * n)))));
  }
}
