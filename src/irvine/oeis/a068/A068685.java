package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068685 Primes which are a sandwich of numbers using at most one digit between two 1's.
 * @author Sean A. Irvine
 */
public class A068685 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
    mA.add(Z.TEN);
    for (long k = 12; k < 20; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final Z t10 = t.multiply(10);
      mA.add(t10.add(t.mod(10)));
      final Z u = t10.add(1);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
