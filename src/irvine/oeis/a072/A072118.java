package irvine.oeis.a072;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A072118 a(n) = (2*n)!/core(n!)^2/(n+1) where core(x) is the squarefree part of x.
 * a(n) = (2*n)!/core(n!)^2/(n+1)
 * @author Georg Fischer
 */
public class A072118 extends LambdaSequence {

  /** Construct the sequence. */
  public A072118() {
    super(1, n -> MemoryFactorial.SINGLETON.factorial(2 * n).divide(Jaguar.factor(MemoryFactorial.SINGLETON.factorial(n)).core().square()).divide(Z.valueOf(n + 1)));
  }
}
