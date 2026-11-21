package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000595;

/**
 * A057132 Number of equivalence classes of self-dual Boolean functions of n variables under action of symmetric group S_n.
 * @author Gregory Morse
 */
public class A057132 extends A000595 {
  private final Z mAlphabet;
  private final int mRadix;

  protected A057132(final int radix) {
    super(1);
    mN = 0;
    mAlphabet = Z.valueOf(radix);
    mRadix = radix;
  }

  /** Construct the sequence. */
  public A057132() {
    this(2);
  }

  @Override
  protected Z fixed(final int[] parts) {
    int order = 1;
    int common = mRadix;
    for (int k = 1; k < parts.length; ++k) {
      if (parts[k] != 0) {
        order = Functions.LCM.i(order, k);
        common = Functions.GCD.i(common, k);
      }
    }
    // The diagonal translation must act freely on the orbits of the permutation.
    if (common != 1) {
      return Z.ZERO;
    }
    Z orbits = Z.ZERO;
    for (int d = 1; d <= order; ++d) {
      if (order % d == 0) {
        int cycles = 0;
        for (int k = 1; k < parts.length; ++k) {
          cycles += Functions.GCD.i(k, d) * parts[k];
        }
        orbits = orbits.add(mAlphabet.pow(cycles).multiply(Functions.PHI.i(order / d)));
      }
    }
    return mAlphabet.pow(orbits.divide((long) mRadix * order).longValueExact());
  }
}
