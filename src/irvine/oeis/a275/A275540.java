package irvine.oeis.a275;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.LambdaSequence;

/**
 * A275540 a(n) = n! + n!! - n - 1.
 * a(n)=n!+n!!-n-1
 * @author Georg Fischer
 */
public class A275540 extends LambdaSequence {

  /** Construct the sequence. */
  public A275540() {
    super(0, n -> MemoryFactorial.SINGLETON.factorial(n).add(MemoryFactorial.SINGLETON.doubleFactorial(n)).subtract(n + 1));
  }
}
