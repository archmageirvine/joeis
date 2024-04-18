package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366685 a(n) = phi(11^n-1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366685 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366685() {
    super(1, new A024127().skip(), k -> {
      return Functions.PHI.z(k);
    });
  }
}

