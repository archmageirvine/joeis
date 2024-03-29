package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-03-08/lambdan at 2024-03-10 23:05

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A370937 Expansion of e.g.f. (1/x) * Series_Reversion( x*(1 - log(1+3*x)/3) ).
 * @author Georg Fischer
 */
public class A370937 extends LambdaSequence {

  /** Construct the sequence. */
  public A370937() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.THREE.pow(n - k).multiply(MemoryFactorial.SINGLETON.factorial(n + k)).multiply(Stirling.firstKind(n, k))).divide(MemoryFactorial.SINGLETON.factorial(n + 1)));
  }
}
