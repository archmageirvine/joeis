package irvine.oeis.a006;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006686 Octavan primes: primes of the form p <code>= x^8 +</code> y^8.
 * @author Sean A. Irvine
 */
public class A006686 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private long mX = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(mX).pow(8);
    while (mPriority.isEmpty() || t.compareTo(mPriority.first()) < 0) {
      t = Z.valueOf(++mX).pow(8);
      for (long y = 1; y <= mX; ++y) {
        final Z z = t.add(Z.valueOf(y).pow(8));
        if (z.isProbablePrime(32)) {
          mPriority.add(z);
        }
      }
    }
    return mPriority.pollFirst();
  }
}
