package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068688 Primes which are a sandwich of numbers made of only one digit between two 7's.
 * @author Sean A. Irvine
 */
public class A068688 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (long k = 70; k < 80; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final Z t10 = t.multiply(10);
      mA.add(t10.add(t.mod(10)));
      final Z u = t10.add(7);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
