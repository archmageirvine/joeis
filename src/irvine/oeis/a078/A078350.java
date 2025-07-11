package irvine.oeis.a078;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.math.z.Z;
import irvine.oeis.a055.A055509;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078350 Number of primes in {n, f(n), f(f(n)), ..., 1}, where f is the Collatz function defined by f(x) = x/2 if x is even; f(x) = 3x + 1 if x is odd.
 * @author Georg Fischer
 */
public class A078350 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078350() {
    super(1, new A055509(), (n, v) -> n == 1 ? Z.ZERO : v.add(1));
  }
}
