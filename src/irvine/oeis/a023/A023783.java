package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023783.
 * @author Sean A. Irvine
 */
public class A023783 implements Sequence {

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
    for (long k = a.mod(15) + 1; k < 15; ++k) {
      mA.add(a.multiply(15).add(k));
    }
    return a;
  }
}

