package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.oeis.a061.A061190;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377678 a(n) = phi(n^n - n) where phi is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A377678 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377678() {
    super(2, new A061190().skip(2), Functions.PHI::z);
  }
}
