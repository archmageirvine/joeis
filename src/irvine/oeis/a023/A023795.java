package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023795.
 * @author Sean A. Irvine
 */
public class A023795 implements Sequence {

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

