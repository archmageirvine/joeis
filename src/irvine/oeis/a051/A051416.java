package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051416 Primes whose digits are composite.
 * @author Sean A. Irvine
 */
public class A051416 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = mA.pollFirst();
      final Z b = a.multiply(10);
      mA.add(b.add(4));
      mA.add(b.add(6));
      mA.add(b.add(8));
      mA.add(b.add(9));
      if (a.mod(10) == 9 && a.isProbablePrime()) {
        return a;
      }
    }
  }
}
