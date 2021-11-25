package irvine.oeis.a052;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;
import irvine.util.Permutation;

/**
 * A052493 Primes whose digits can be rearranged to give the initial terms of the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A052493 extends A000796 {

  private final List<Z> mA = new ArrayList<>();
  private int[] mDigits = {};
  private int mM = 0;

  @Override
  public Z next() {
    while (mM >= mA.size()) {
      mM = 0;
      mA.clear();
      mDigits = Arrays.copyOf(mDigits, mDigits.length + 1);
      mDigits[mDigits.length - 1] = super.next().intValueExact();
      Arrays.sort(mDigits);
      // Fix so leading digit is non-zero
      int k = 0;
      while (mDigits[k] == 0) {
        ++k;
      }
      if (k > 0) {
        mDigits[0] = mDigits[k];
        mDigits[k] = 0;
      }
      final Permutation perm = new Permutation(mDigits, false);
      int[] p;
      while ((p = perm.next()) != null) {
        final Z t = A052495.permToZ(p);
        if (t.isProbablePrime()) {
          mA.add(t);
        }
      }
    }
    return mA.get(mM++);
  }
}

