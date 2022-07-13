package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057898 Largest number such that n = m^a(n) - a(n) with m a positive integer; i.e., where (n + a(n))^(1/a(n)) is a positive integer.
 * @author Sean A. Irvine
 */
public class A057898 extends A057897 {

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
        t.root(k);
        if (t.auxiliary() == 1) {
          return Z.valueOf(k);
        }
      }
    }
    return Z.ONE;
  }
}

