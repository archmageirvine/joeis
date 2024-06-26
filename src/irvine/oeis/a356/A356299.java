package irvine.oeis.a356;
// Generated by gen_seq4.pl 2024-06-16/simtraf at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.a342.A342001;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A356299 a(n) = gcd(A276086(n), A342001(n)), where A276086 is the primorial base exp-function, and A342001 is the arithmetic derivative without its inherited divisor.
 * @author Georg Fischer
 */
public class A356299 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A356299() {
    super(1, new A342001(), (n, v) -> Functions.GCD.z(Functions.PRIMORIAL_BASE_EXP.z(n), v));
  }
}
