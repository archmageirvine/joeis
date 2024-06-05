package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a062.A062394;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366630 a(n) = phi(6^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366630 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366630() {
    super(0, new A062394(), k -> Functions.PHI.z(k));
  }
}

