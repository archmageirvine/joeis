package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048413 Primes whose consecutive digits differ by 1 or 2.
 * @author Sean A. Irvine
 */
public class A048413 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected int base() {
    return 10;
  }

  protected long diff() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final Z res = mA.pollFirst();
      final long d = res.mod(base());
      final Z t = res.multiply(base());
      if (!t.isZero()) {
        for (long k = 0; k < base(); ++k) {
          final long diff = Math.abs(d - k);
          if (diff == diff() || diff == diff() - 1) {
            mA.add(t.add(k));
          }
        }
      }
      if (res.isProbablePrime()) {
        return res;
      }
    }
  }
}
