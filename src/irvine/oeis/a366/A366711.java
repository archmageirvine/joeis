package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.oeis.a024.A024140;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366711 a(n) = phi(12^n-1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A366711 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366711() {
    super(1, new A024140().skip(), k -> {
      return Functions.PHI.z(k);
    });
  }
}

