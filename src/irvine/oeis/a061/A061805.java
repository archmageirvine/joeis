package irvine.oeis.a061;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061805 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN % 20 == 0 || mN % 25 == 0 || mN % 256 == 0) {
      return Z.ZERO;
    }
    final TreeSet<Z> s = new TreeSet<>();
    for (int k = 1; k < 10; ++k) {
      s.add(Z.valueOf(k));
    }
    while (true) {
      final Z t = s.pollFirst();
      if (t.mod(mN) == 0) {
        return t;
      }
      if (t.bitLength() > 1000000) { // heuristic
        return Z.ZERO;
      }
      s.add(t.multiply(10).add((t.mod(10) + 1) % 10));
    }
  }
}

