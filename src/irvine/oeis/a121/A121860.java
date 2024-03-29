package irvine.oeis.a121;
// Generated by gen_seq4.pl sumdiv at 2023-04-05 22:33

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A121860 a(n) = Sum_{d|n} n!/(d!*(n/d)!).
 * @author Georg Fischer
 */
public class A121860 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A121860() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> MemoryFactorial.SINGLETON.factorial(mN).divide(MemoryFactorial.SINGLETON.factorial(d).multiply(MemoryFactorial.SINGLETON.factorial(mN / d))));
  }
}
