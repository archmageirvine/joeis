package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076123 Rearrangement of natural numbers so that the product of n terms starting from a(n) is a square.
 * @author Sean A. Irvine
 */
public class A076123 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  protected final List<Long> mA = new ArrayList<>();
  private long mK = 0;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mUsed.add(1L);
      mA.add(1L);
      return Z.ONE;
    }
    if ((mN & 1) == 1) {
      while (mUsed.remove(++mK)) {
        // do nothing
      }
      mA.add(mK);
      return Z.valueOf(mK);
    }
    Z prod = Z.ONE;
    for (int j = mN / 2; j < mN; ++j) {
      prod = prod.multiply(mA.get(j));
    }
    long i = mK;
    while (true) {
      final Z t = prod.multiply(++i);
      if (Predicates.SQUARE.is(t) && mUsed.add(i)) {
        mA.add(i);
        return Z.valueOf(i);
      }
    }
  }
}
