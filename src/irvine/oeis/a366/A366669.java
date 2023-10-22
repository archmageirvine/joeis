package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a062.A062397;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366669 a(n) = phi(10^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366669 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366669() {
    super(0, new A062397(), k -> Euler.phi(k));
  }
}

