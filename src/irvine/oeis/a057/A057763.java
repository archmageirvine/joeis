package irvine.oeis.a057;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057763 Least nonnegative square root of 5 mod n for n in A057762.
 * @author Sean A. Irvine
 */
public class A057763 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final IntegersModMul m = new IntegersModMul(mN);
      final Z r = m.coerce(Z.FIVE);
      for (Z k = Z.ZERO; k.compareTo(mN) < 0; k = k.add(1)) {
        if (m.add(k, k).equals(r)) {
          return k;
        }
      }
    }
  }
}

