package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062885 Smallest multiple of n with property that digits are even and each digit is two less (mod 10) than the previous digit, if such a multiple exists; otherwise -1.
 * @author Sean A. Irvine
 */
public class A062885 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    if (420864 % mN != 0 && (mN % 25 == 0 || mN % 40 == 0 || mN % 256 == 0)) {
      return Z.NEG_ONE;
    }
    final TreeSet<Z> a = new TreeSet<>();
    a.add(Z.EIGHT);
    a.add(Z.SIX);
    a.add(Z.FOUR);
    a.add(Z.TWO);
    while (true) {
      final Z t = a.pollFirst();
      if (t.mod(mN) == 0) {
        return t;
      }
      a.add(t.multiply(10).add((t.mod(10) + 8) % 10));
    }
  }
}

