package irvine.oeis.a076;
// Generated by gen_seq4.pl 2023-11-13/filtpos at 2023-11-17 15:02

import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.LambdaSequence;

/**
 * A076210 Numbers n such that (-n!!+(n+1)!!+1)/2 is prime.
 * @author Georg Fischer
 */
public class A076210 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076210() {
    super(1, 1, new LambdaSequence(1, n -> MemoryFactorial.SINGLETON.doubleFactorial(n).negate().add(MemoryFactorial.SINGLETON.doubleFactorial(n + 1)).add(1).divide(2)), PRIME);
  }
}
