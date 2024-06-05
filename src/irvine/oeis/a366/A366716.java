package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a178.A178248;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366716 a(n) = phi(12^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366716 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366716() {
    super(0, new A178248(), k -> Functions.PHI.z(k));
  }
}

