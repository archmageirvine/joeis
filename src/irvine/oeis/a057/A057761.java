package irvine.oeis.a057;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057761 Least nonnegative cube root of 2 mod n for n in A057760.
 * @author Sean A. Irvine
 */
public class A057761 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final IntegersModMul m = new IntegersModMul(mN);
      final Z r = m.coerce(Z.TWO);
      for (Z k = Z.ZERO; k.compareTo(mN) < 0; k = k.add(1)) {
        if (m.groupMultiply(k, 3).equals(r)) {
          return k;
        }
      }
    }
  }
}

