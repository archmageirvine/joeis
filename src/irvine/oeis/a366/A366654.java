package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.oeis.a024.A024088;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366654 a(n) = phi(8^n-1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366654 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366654() {
    super(1, new A024088().skip(), k -> Euler.phi(k));
  }
}

