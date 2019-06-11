package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023796 Katadromes: digits in base 15 are in strict descending order.
 * @author Sean A. Irvine
 */
public class A023796 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (long k = 0; k < 15; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(15);
    for (long k = a.mod(15) - 1; k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

