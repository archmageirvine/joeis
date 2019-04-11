package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A000810 Expansion of e.g.f. (sin <code>x +</code> cos x)/cos <code>3x</code>.
 * @author Sean A. Irvine
 */
public class A000810 extends A000436 {

  private final ArrayList<Z> mOdd = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return super.next();
    }
    Z s = Z.ONE;
    final int n = mN / 2;
    for (int k = 0; k < n; ++k) {
      final Z t = Binomial.binomial(mN, 2 * k + 1).multiply(Z.THREE.pow(mN - 1 - 2 * k)).multiply(mOdd.get(k));
      s = s.signedAdd((k & 1) == 1, t);
    }
    mOdd.add((n & 1) == 0 ? s : s.negate());
    return mOdd.get(n);
  }
}

