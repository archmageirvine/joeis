package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a052.A052539;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366608 a(n) = phi(4^n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366608 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366608() {
    super(0, new A052539(), k -> {
      return Functions.PHI.z(k);
    });
  }
}

