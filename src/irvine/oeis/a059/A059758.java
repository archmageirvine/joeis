package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059758 Undulating palindromic primes: numbers that are prime, palindromic in base 10, and the digits alternate: ababab... with a != b.
 * @author Sean A. Irvine
 */
public class A059758 implements Sequence {

  private static final int[] A = {1, 3, 7, 9};
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (final int a : A) {
      for (int b = 0; b <= 9; ++b) {
        mA.add(Z.valueOf(a * 10 + b));
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final long r = t.mod(100);
      mA.add(t.multiply(100).add(r));
      final Z c = t.multiply(10).add(r / 10);
      if (c.isProbablePrime()) {
        return c;
      }
    }
  }
}
