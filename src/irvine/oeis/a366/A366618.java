package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366618 a(n) = phi(5^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366618 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366618() {
    super(0, new A034474(), k -> {
      return Functions.PHI.z(k);
    });
  }
}

