package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023782 Metadromes: digits in base 14 are in strict ascending order.
 * @author Sean A. Irvine
 */
public class A023782 extends Sequence1 {

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
    for (long k = a.mod(14) + 1; k < 14; ++k) {
      mA.add(a.multiply(14).add(k));
    }
    return a;
  }
}

