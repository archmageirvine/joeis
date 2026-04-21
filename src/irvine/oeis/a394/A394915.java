package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Pair;

/**
 * A394915 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A394915 extends A000040 {

  private final HashSet<Pair<Z, Z>> mLines = new HashSet<>();
  private final HashSet<Pair<Q, Q>> mIntersections = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    final Z slope = q.subtract(p);
    final Z intercept = p.subtract(slope.multiply(++mN));
    for (final Pair<Z, Z> line : mLines) {
      if (!line.left().equals(slope)) {
        final Q x = new Q(intercept.subtract(line.right()), line.left().subtract(slope));
        final Q y = x.multiply(slope).add(intercept);
        mIntersections.add(new Pair<>(x, y));
      }
    }
    mLines.add(new Pair<>(slope, intercept));
    return Z.valueOf(mIntersections.size());
  }
}
