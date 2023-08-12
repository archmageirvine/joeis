package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065062 Numbers k such that A065608(k) = A065608(k+1).
 * @author Sean A. Irvine
 */
public class A065062 extends A065608 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}

