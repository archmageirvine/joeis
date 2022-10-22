package irvine.oeis.a336;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A336810 Continued fraction expansion of Sum_{k&gt;=0} 1/(k!)!.
 * @author Georg Fischer
 */
public class A336810 extends FoldedContinuedFraction {

  /** Construct the sequence. */
  public A336810() {
    super(0, k -> MemoryFactorial.SINGLETON.factorial(MemoryFactorial.SINGLETON.factorial(k + 3).intValue())
        .divide  (MemoryFactorial.SINGLETON.factorial(MemoryFactorial.SINGLETON.factorial(k + 2).intValue()).square())
        , 2, 1, 1, 179, 2
        //, 1196852626800230399L
        );
  }
}
