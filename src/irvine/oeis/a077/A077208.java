package irvine.oeis.a077;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077208 Rearrangement of squarefree numbers such that a(k) begins with the end of a(k-1).
 * @author Sean A. Irvine
 */
public class A077208 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mPrev = null;

  private boolean canUse(final Z n) {
    if (mUsed.contains(n)) {
      return false;
    }
    if (n.mod(4) == 0) {
      return false; // 2^2 is a factor
    }
    if (n.mod(9) == 0) {
      return false; // 3^2 is a factor
    }
    if (n.mod(25) == 0) {
      return false; // 5^2 is a factor
    }
    // general test for square free
    if (Jaguar.factor(n).maxExponent() > 1) {
      mUsed.add(n); // only for efficiency
      return false;
    }
    return true;
  }

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.TWO;
      mUsed.add(Z.TWO);
      mUsed.add(Z.ONE);
      return Z.TWO;
    }
    final long sv = mPrev.mod(10); // last digit of previous
    final char tv = (char) (sv + '0');
    long k = sv;
    while (true) {
      if (k % 10 != 0) {
        final String t = String.valueOf(k);
        if (t.charAt(0) == tv) {
          final Z c = new Z(t);
          if (canUse(c)) {
            mPrev = c;
            mUsed.add(c);
            return c;
          }
        }
      }
      ++k;
    }
  }
}


