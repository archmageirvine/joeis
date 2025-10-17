package irvine.oeis.a387;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a296.A296030;
import irvine.util.Point;

/**
 * A387981 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A387981 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mCoords = new A296030();
  private final HashMap<Long, Point> mPrimeToCoords = new HashMap<>();
  private long mP = 2;
  private long mN = 3;

  private Point getCoords(final long p) {
    while (mP < p) {
      mP = mPrime.nextPrime(mP);
      final Point pt = new Point(mCoords.next().intValueExact(), mCoords.next().intValueExact());
      mPrimeToCoords.put(mP, pt);
    }
    return mPrimeToCoords.get(p);
  }

  private boolean is(final long n) {
    final long m = 2 * n;
    for (long p = 3; 2 * p < m; p = mPrime.nextPrime(p)) {
      final long q = m - p;
      if (mPrime.isPrime(q)) {
        final Point pt0 = getCoords(p);
        final Point pt1 = getCoords(q);
        final int dx = Math.abs(pt0.left() - pt1.left());
        final int dy = Math.abs(pt0.right() - pt1.right());
        if (dx <= 1 && dy <= 1) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (!is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
