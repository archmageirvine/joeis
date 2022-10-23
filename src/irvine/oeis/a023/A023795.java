package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023795 Katadromes: digits in base 14 are in strict descending order.
 * @author Sean A. Irvine
 */
public class A023795 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (long k = 0; k < 14; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(14);
    for (long k = a.mod(14) - 1; k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

