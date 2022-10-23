package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A016087 First nontrivial or multidigital Armstrong number to base n.
 * @author Sean A. Irvine
 */
public class A016087 extends Sequence3 {

  private long mN = 2;

  private boolean isArmstrong(final long m, final long n, final int p) {
    long h = m;
    final Z zm = Z.valueOf(m);
    Z s = Z.ZERO;
    while (h != 0) {
      s = s.add(Z.valueOf(h % n).pow(p));
      h /= n;
      if (s.compareTo(zm) > 0) {
        return false;
      }
    }
    return s.equals(zm);
  }

  @Override
  public Z next() {
    long m = ++mN;
    long l = m * mN;
    int p = 2; // number of digits in m when written in base mN
    while (true) {
      if (isArmstrong(m, mN, p)) {
        return Z.valueOf(m);
      }
      if (++m == l) {
        l *= mN;
        ++p;
      }
    }
  }
}
