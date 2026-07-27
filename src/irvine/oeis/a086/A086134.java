package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003415;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086134 Smallest prime factor of arithmetic derivative of n or a(n)=0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A086134 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086134() {
    super(0, new A003415(), k -> k.compareTo(Z.ONE) <= 0 ? Z.ZERO : Functions.LPF.z(k));
  }
}

