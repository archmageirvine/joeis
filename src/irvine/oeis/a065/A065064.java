package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065064 Numbers k such that A065608(k) = A065608(k+2).
 * @author Sean A. Irvine
 */
public class A065064 extends A065608 {

  private long mN = 0;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}

