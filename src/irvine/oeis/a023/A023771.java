package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023771 Nialpdromes: digits in base 16 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023771 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 1; k < 16; ++k) {
        mA.add(Z.valueOf(k));
      }
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(16);
    for (long k = a.mod(16); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

