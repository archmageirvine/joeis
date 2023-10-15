package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a034.A034472;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366579 a(n) = phi(3^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366579 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366579() {
    super(0, new A034472(), k -> Euler.phi(k));
  }
}

