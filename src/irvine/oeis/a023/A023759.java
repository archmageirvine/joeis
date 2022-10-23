package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023759 Nialpdromes: digits in base 3 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023759 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      mA.add(Z.TWO);
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(3);
    for (long k = a.mod(3); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

