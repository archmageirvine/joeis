package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A078420 Numbers n such that h(n) = 3 h(n-1) where h(n) is the length of the sequence {n, f(n), f(f(n)), ...., 1} in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078420 extends A006577 {

  private long mN = 1;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.multiply(3).add(2).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}

