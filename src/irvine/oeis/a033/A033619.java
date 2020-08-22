package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033619 Undulating numbers (of form abababab... in base 10).
 * @author Sean A. Irvine
 */
public class A033619 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (long k = 0; k < 100; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    final Z t = mA.pollFirst();
    if (!Z.ZERO.equals(t)) {
      mA.add(t.multiply(10).add(t.mod(100) / 10));
    }
    return t;
  }
}
