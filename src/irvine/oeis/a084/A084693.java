package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084693 a(n) is smallest positive integer not already in the sequence such that every partial sum is squarefree.
 * @author Sean A. Irvine
 */
public class A084693 extends Sequence0 {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mLeastUnused = Z.ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    Z k = mLeastUnused;
    while (true) {
      if (!mUsed.contains(k)) {
        final Z t = mSum.add(k);
        if (Predicates.SQUARE_FREE.is(t)) {
          mSum = t;
          mUsed.add(k);
          return k;
        }
      }
      k = k.add(1);
    }
  }
}
