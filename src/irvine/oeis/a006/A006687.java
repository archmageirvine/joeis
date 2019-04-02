package irvine.oeis.a006;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006687 Duodecimal primes: p = (x^12 + y^12 )/(x^4 + y^4 ).
 * @author Sean A. Irvine
 */
public class A006687 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private long mX = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(mX).pow(8);
    while (mPriority.isEmpty() || t.compareTo(mPriority.first()) < 0) {
      t = Z.valueOf(++mX).pow(8);
      for (long y = 1; y <= mX; ++y) {
        final Z z = t.add(Z.valueOf(y).pow(8)).subtract(Z.valueOf(mX).multiply(y).pow(4));
        if (z.isProbablePrime(32)) {
          mPriority.add(z);
        }
      }
    }
    return mPriority.pollFirst();
  }
}
