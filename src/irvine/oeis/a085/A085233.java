package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085233 Numbers k such that k is divisible by a power of its smallest prime factor that exceeds its square root.
 * @author Sean A. Irvine
 */
public class A085233 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085233() {
    super(1, 2, k -> {
      final Z lpf = Functions.LPF.z(k);
      return lpf.pow(Functions.VALUATION.l(k, lpf) * 2).compareTo(k) > 0;
    });
  }
}
