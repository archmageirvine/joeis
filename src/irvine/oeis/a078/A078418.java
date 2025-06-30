package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A078418 Numbers n such that h(n) = h(n-1) + h(n-2), where h(n) is the length of the sequence {n, f(n), f(f(n)), ...., 1} in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078418 extends A006577 {

  private long mN = 2;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mB.equals(mA.add(t).add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

