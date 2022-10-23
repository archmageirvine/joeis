package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023788 Katadromes: digits in base 6 are in strict descending order.
 * @author Sean A. Irvine
 */
public class A023788 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.THREE);
    mA.add(Z.FOUR);
    mA.add(Z.FIVE);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(6);
    for (long k = a.mod(6) - 1; k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

