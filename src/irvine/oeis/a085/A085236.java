package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085236 (Greatest power of greatest prime factor of n) &lt; square root(n).
 * @author Sean A. Irvine
 */
public class A085236 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085236() {
    super(1, 2, k -> {
      final Z gpf = Functions.GPF.z(k);
      return gpf.pow(Functions.VALUATION.l(k, gpf) * 2).compareTo(k) < 0;
    });
  }
}
