package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366667 a(n) = phi(9^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366667 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366667() {
    super(0, new A062396(), k -> Functions.PHI.z(k));
  }
}

