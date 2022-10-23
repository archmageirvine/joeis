package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023764 Nialpdromes: digits in base 8 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023764 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      mA.add(Z.TWO);
      mA.add(Z.THREE);
      mA.add(Z.FOUR);
      mA.add(Z.FIVE);
      mA.add(Z.SIX);
      mA.add(Z.SEVEN);
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(8);
    for (long k = a.mod(8); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

