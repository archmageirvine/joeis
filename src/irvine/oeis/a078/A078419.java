package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A078419 Numbers n such that h(n) = 2 h(n-1) where h(n) is the length of the sequence {n, f(n), f(f(n)), ...., 1} in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078419 extends A006577 {

  private long mN = 1;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.multiply2().add(1).equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}

