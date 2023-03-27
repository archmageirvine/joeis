package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062350 Primes containing digits 1, 2, 3 only.
 * @author Sean A. Irvine
 */
public class A062350 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.THREE);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final Z t10 = t.multiply(10);
      mA.add(t10.add(1));
      mA.add(t10.add(2));
      mA.add(t10.add(3));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
