package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023778 Metadromes: digits in base 9 are in strict ascending order.
 * @author Sean A. Irvine
 */
public class A023778 extends Sequence1 {

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
    for (long k = a.mod(9) + 1; k < 9; ++k) {
      mA.add(a.multiply(9).add(k));
    }
    return a;
  }
}

