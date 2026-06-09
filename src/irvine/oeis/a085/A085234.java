package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085234 (Greatest power of smallest prime factor of n) &lt; square root(n).
 * @author Sean A. Irvine
 */
public class A085234 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085234() {
    super(1, 2, k -> {
      final Z lpf = Functions.LPF.z(k);
      return lpf.pow(Functions.VALUATION.l(k, lpf) * 2).compareTo(k) < 0;
    });
  }
}
