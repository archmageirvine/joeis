package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076034 Group the natural numbers so that the n-th group contains the smallest set of n relatively prime numbers: (1), (2, 3), (4, 5, 7), (6, 11, 13, 17), (8, 9, 19, 23, 25), (10, 21, 29, 31, 37, 41), ...
 * @author Sean A. Irvine
 */
public class A076034 extends Sequence1 {

  private final TreeSet<Z> mUsed = new TreeSet<>(); // keeps used numbers > mS
  protected final List<Z> mA = new ArrayList<>(); // the current row
  private int mK = 0; // position we are in mA during output
  private long mN = 0;
  private Z mS = Z.TWO; // least unused number

  private boolean isOk(final Z m) {
    for (final Z t : mA) {
      if (!t.gcd(m).equals(Z.ONE)) {
        return false;
      }
    }
    return true;
  }

  protected void step() {
    mA.clear();
    mK = 0;
    if (++mN == 1) {
      mA.add(Z.ONE);
      return;
    }
    Z m = mS;
    for (long k = 0; k < mN; ++k) {
      while (mUsed.contains(m) || !isOk(m)) {
        m = m.add(1);
      }
      mUsed.add(m);
      mA.add(m);
    }
    while (mUsed.remove(mS)) {
      mS = mS.add(1);
    }
  }

  @Override
  public Z next() {
    if (++mK >= mA.size()) {
      step();
    }
    return mA.get(mK);
  }
}
