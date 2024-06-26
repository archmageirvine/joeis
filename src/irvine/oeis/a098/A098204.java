package irvine.oeis.a098;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a007.A007691;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A098204 Greatest common divisor of multiperfect numbers and their totient.
 * @author Georg Fischer
 */
public class A098204 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A098204() {
    super(1, new A007691(), (n, v) -> v.gcd(Functions.PHI.z(v)));
  }
}
