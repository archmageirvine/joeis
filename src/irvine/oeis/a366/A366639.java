package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a034.A034491;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366639 a(n) = phi(7^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366639 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366639() {
    super(0, new A034491(), k -> Euler.phi(k));
  }
}

