package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023746 Plaindromes: numbers whose digits in base 4 are in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A023746 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    // Actually construct in base 10 using digits 1, 2, 3.
    final Z a = mA.pollFirst();
    for (long k = Math.max(1, a.mod(10)); k <= 3; ++k) {
      mA.add(a.multiply(10).add(k));
    }
    // Remap as if base 4 to base 10
    return new Z(a.toString(), 4);
  }
}

