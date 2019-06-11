package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023770 Nialpdromes: digits in base 15 are in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A023770 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 1; k < 15; ++k) {
        mA.add(Z.valueOf(k));
      }
      return Z.ZERO;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(15);
    for (long k = a.mod(15); k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

