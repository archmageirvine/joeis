package irvine.oeis.a005;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A005278 Noncototients: n such that x - phi(x) = n has no solution.
 * @author Sean A. Irvine
 */
public class A005278 extends A051953 {

  // Assuming Goldbach, all values are even
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  private void add(final Z n) {
    if (n.isEven() && n.compareTo(mN) >= 0) {
      mSeen.add(n);
    }
  }

  @Override
  public Z next() {
    while (true) {
      add(super.next());
      add(super.next());
      add(super.next());
      add(super.next());
      mN = mN.add(2);
      if (!mSeen.remove(mN)) {
        return mN;
      }
    }
  }
}

