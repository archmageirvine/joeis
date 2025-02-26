package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075533.
 * @author Sean A. Irvine
 */
public class A075558 extends A000040 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    long c = 3;
    while (true) {
      if (!mPrime.isPrime(++c)) {
        final Z s = mSum.add(c);
        if (s.mod(p).isZero() && mUsed.add(c)) {
          mSum = s;
          return Z.valueOf(c);
        }
      }
    }
  }
}

