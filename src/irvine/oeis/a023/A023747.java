package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023747 Plaindromes: numbers whose digits in base 5 are in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A023747 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    // Actually construct in base 10 using digits 1, 2, 3, 4.
    final Z a = mA.pollFirst();
    for (long k = Math.max(1, a.mod(10)); k <= 4; ++k) {
      mA.add(a.multiply(10).add(k));
    }
    // Remap as if base 5 to base 10
    return new Z(a.toString(), 5);
  }
}

