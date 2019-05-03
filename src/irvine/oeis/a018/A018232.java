package irvine.oeis.a018;

import java.util.TreeSet;

import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A018232 Consider pairs <code>(k,m)</code> such that <code>k^2</code> begins with a 1 and when the 1 is changed to a 2 we again get a square, <code>m^2</code>; sequence gives values of m for primitive solutions.
 * @author Sean A. Irvine
 */
public class A018232 implements Sequence {

  // Primitive here appears to mean getting rid of multiples of 10.
  // Hence (1450,1050) is discarded since we already have (145,105)

  private static final Q CONS = new Q(3, 2);
  private int mQ = -1;
  private Z mT = Z.ONE;
  private final TreeSet<Pair<Z, Z>> mPairs = new TreeSet<>((a, b) -> {
    final int c = a.left().compareTo(b.left());
    if (c != 0) {
      return c;
    }
    return a.right().compareTo(b.right());
  });

  protected Z select(final Pair<Z, Z> pair) {
    return pair.right();
  }

  @Override
  public Z next() {
    while (mPairs.isEmpty()) {
      if (++mQ > 1) {
        mT = mT.multiply(10);
      }
      final FactorSequence fs = new FactorSequence();
      fs.add(Z.TWO, FactorSequence.PRIME, mQ);
      fs.add(Z.FIVE, FactorSequence.PRIME, mQ);
      for (final Z a : fs.divisors()) {
        final Z b = mT.divide(a);
        if (a.isEven() == b.isEven() && a.compareTo(b) > 0) {
          final Z x = a.subtract(b).divide2();
          final Z y = a.subtract(x);
          if (x.mod(10) != 0 && y.mod(10) != 0 && mT.equals(y.square().subtract(x.square()))) {
            final Q r = new Q(y, x).square();
            if (r.compareTo(Q.TWO) < 0 && r.compareTo(CONS) > 0) {
              mPairs.add(new Pair<>(x, y));
            }
          }
        }
      }
    }
    final Pair<Z, Z> next = mPairs.pollFirst();
    return select(next);
  }
}

