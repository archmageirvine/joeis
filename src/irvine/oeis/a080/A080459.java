package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080459 Trans-Harshad numerals: base-10 numerals that represent positive Harshad numbers in every base in which they occur.
 * @author Sean A. Irvine
 */
public class A080459 extends Sequence1 {

  private long mN = 0;

  private Z toBase(final String s, final long base) {
    Z v = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      v = v.multiply(base).add(s.charAt(k) - '0');
    }
    return v;
  }

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    int syn = Functions.SYNDROME.i(n);
    long minBase = 0;
    while (syn != 0) {
      ++minBase;
      syn >>>= 1;
    }
    while (minBase < n) {
      if (!Predicates.HARSHAD.is(minBase, toBase(s, minBase))) {
        return false;
      }
      ++minBase;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

