package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023769 Nialpdromes: digits in base 14 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023769 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 1; k < 14; ++k) {
        mA.add(Z.valueOf(k));
      }
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(14);
    for (long k = a.mod(14); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

