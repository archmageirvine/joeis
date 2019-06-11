package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023780 Metadromes: digits in base 12 are in strict ascending order.
 * @author Sean A. Irvine
 */
public class A023780 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    final Z a = mA.pollFirst();
    if (a == null) {
      return null;
    }
    for (long k = a.mod(12) + 1; k < 12; ++k) {
      mA.add(a.multiply(12).add(k));
    }
    return a;
  }
}

