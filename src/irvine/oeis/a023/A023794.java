package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023794.
 * @author Sean A. Irvine
 */
public class A023794 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (long k = 0; k < 13; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      return null;
    }
    final Z a = mA.pollFirst();
    final Z b = a.multiply(13);
    for (long k = a.mod(13) - 1; k >= 0; --k) {
      mA.add(b.add(k));
    }
    return a;
  }
}

