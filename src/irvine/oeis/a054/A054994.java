package irvine.oeis.a054;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A054994.
 * @author Sean A. Irvine
 */
public class A054994 extends A002144 {

  protected final ArrayList<Z> mA2144 = new ArrayList<>();
  private final TreeMap<Z, int[]> mSeq = new TreeMap<>();
  {
    mSeq.put(Z.ONE, new int[0]);
  }

  private Z getA2144(final int n) {
    while (n >= mA2144.size()) {
      mA2144.add(super.next());
    }
    return mA2144.get(n);
  }

  protected Z select(final Map.Entry<Z, int[]> entry) {
    return entry.getKey();
  }

  @Override
  public Z next() {
    final Map.Entry<Z, int[]> entry = mSeq.pollFirstEntry();
    // Extend entry in all possible ways
    final Z n = entry.getKey();
    final int[] exponents = entry.getValue();
    // First increase each exponent that can be increased
    for (int k = 0; k < exponents.length; ++k) {
      if (k == 0 || exponents[k] < exponents[k - 1]) {
        final int[] newExponents = Arrays.copyOf(exponents, exponents.length);
        ++newExponents[k];
        mSeq.put(n.multiply(getA2144(k)), newExponents);
      }
    }
    // Add one more element to end of exponent vector
    final int[] newExponents = Arrays.copyOf(exponents, exponents.length + 1);
    newExponents[exponents.length] = 1;
    mSeq.put(n.multiply(getA2144(exponents.length)), newExponents);
    return select(entry);
  }

}
