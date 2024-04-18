package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024062;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366623 a(n) = phi(6^n-1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366623 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366623() {
    super(1, new A024062().skip(), k -> {
      return Functions.PHI.z(k);
    });
  }
}

