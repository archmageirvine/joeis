package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003415;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086131 Largest prime factor of arithmetic derivative of n if it exists, or a(n)=0 for n=1 and n=prime.
 * @author Sean A. Irvine
 */
public class A086131 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086131() {
    super(1, new A003415().skip(), k -> k.compareTo(Z.ONE) <= 0 ? Z.ZERO : Functions.GPF.z(k));
  }
}

