package irvine.oeis.a086;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A086337 Numbers k such that k, k-1 and k-2 have the same prime signature.
 * @author Sean A. Irvine
 */
public class A086337 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086337() {
    super(1, 35, k -> {
      final int[] s = FactorUtils.primeSignature(Z.valueOf(k));
      return Arrays.equals(s, FactorUtils.primeSignature(Z.valueOf(k - 1))) && Arrays.equals(s, FactorUtils.primeSignature(Z.valueOf(k - 2)));
    });
  }
}
