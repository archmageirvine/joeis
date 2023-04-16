package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062886 Smallest multiple of 2n+1 with property that digits are odd and each digit is two more (mod 10) than the previous digit; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A062886 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN % 25 == 0) {
      return Z.ZERO;
    }
    final TreeSet<Z> a = new TreeSet<>();
    a.add(Z.NINE);
    a.add(Z.SEVEN);
    a.add(Z.FIVE);
    a.add(Z.THREE);
    a.add(Z.ONE);
    while (true) {
      final Z t = a.pollFirst();
      if (t.mod(mN) == 0) {
        return t;
      }
      a.add(t.multiply(10).add((t.mod(10) + 2) % 10));
    }
  }
}

