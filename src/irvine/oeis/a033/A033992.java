package irvine.oeis.a033;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033992 Numbers that are divisible by exactly three different primes.
 * @author Sean A. Irvine
 */
public class A033992 extends Sequence1 {

  private final TreeMap<Z, int[]> mS = new TreeMap<>();
  private final int mOmega;

  /**
   * Construct the sequence for a particular omega.
   * @param omega number of distinct primes
   */
  public A033992(final int omega) {
    mOmega = omega;
    // state has omega prime indexes and omega exponents
    final int[] state = new int[2 * omega];
    for (int k = 0; k < omega; ++k) {
      state[k] = k + 1;
      state[k + omega] = 1;
    }
    mS.put(value(state), state);
  }

  /** Construct the sequence. */
  public A033992() {
    this(3);
  }

  private Z value(final int[] state) {
    Z prod = Z.ONE;
    for (int k = 0; k < mOmega; ++k) {
      prod = prod.multiply(Functions.PRIME.z(state[k]).pow(state[mOmega + k]));
    }
    return prod;
  }

  @Override
  public Z next() {
    final Map.Entry<Z, int[]> e = mS.pollFirstEntry();
    final Z v = e.getKey();
    final int[] state = e.getValue();
    // Increase powers in all possible way
    boolean isSimple = true;
    for (int k = 0; k < mOmega; ++k) {
      final int[] s = state.clone();
      if (++s[mOmega + k] > 2) {
        isSimple = false;
      }
      mS.put(v.multiply(Functions.PRIME.l(s[k])), s);
    }
    if (isSimple) {
      // All exponents were 1, increase the primes themselves
      for (int k = 0; k < mOmega - 1; ++k) {
        if (state[k] + 1 < state[k + 1]) {
          final int[] s = state.clone();
          ++s[k];
          mS.put(value(s), s);
        }
      }
      ++state[mOmega - 1]; // increase the last prime
      mS.put(value(state), state);
    }
    return v;
  }
}
