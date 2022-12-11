package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034873 Primes in which each digit occurs in runs of at least 2.
 * @author Sean A. Irvine
 */
public class A034873 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final long r = t.mod(10);
      if (!t.isZero()) {
        mA.add(t.multiply(10).add(r));
      }
      for (long d = 0; d < 10; ++d) {
        if (d != r) {
          mA.add(t.multiply(100).add(d * 10 + d));
        }
      }
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
