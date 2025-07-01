package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A078418 Numbers k such that h(k) = h(k-1) + h(k-2), where h(k) = A006577(k) + 1 is the length of the sequence {k, f(k), f(f(k)), ...., 1} in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
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

