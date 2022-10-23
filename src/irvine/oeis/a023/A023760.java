package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023760 Nialpdromes: digits in base 4 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023760 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      mA.add(Z.TWO);
      mA.add(Z.THREE);
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(4);
    for (long k = a.mod(4); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

