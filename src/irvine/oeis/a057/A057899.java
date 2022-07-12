package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057899 Smallest positive integer such that n=a(n)^k-k with k a positive integer.
 * @author Sean A. Irvine
 */
public class A057899 extends A057897 {

  private Z mN = Z.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mA)) {
      mA = super.next();
      int k = 1;
      while (true) {
        // Assume there is only one solution
        final Z t = mN.add(++k);
        final Z r = t.root(k);
        if (t.auxiliary() == 1) {
          return r;
        }
      }
    }
    return mN.add(1);
  }
}

