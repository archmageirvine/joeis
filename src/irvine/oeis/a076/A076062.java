package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076062 Group the positive integers so that the n-th group contains n numbers whose sum is a multiple of the n-th prime.
 * @author Sean A. Irvine
 */
public class A076062 extends A000040 {

  private final TreeSet<Z> mUsed = new TreeSet<>(); // keeps used numbers > mS
  protected final List<Z> mA = new ArrayList<>(); // the current row
  private int mK = 0; // position we are in mA during output
  private long mN = 0;
  private Z mS = Z.ONE; // least unused number

  protected void step() {
    final Z p = super.next();
    mA.clear();
    mK = 0;
    ++mN;
    Z sum = Z.ZERO;
    Z m = mS;
    // The first n-1 numbers are simply the smallest not yet used
    for (long k = 0; k < mN - 1; ++k) {
      while (!mUsed.add(m)) {
        m = m.add(1);
      }
      sum = sum.add(m);
      mA.add(m);
    }

    // Choose last number
    final Z r = p.subtract(sum.mod(p));
    Z u = m.divide(p).multiply(p).add(r);
    while (u.compareTo(m) <= 0) {
      u = u.add(p);
    }
    while (!mUsed.add(u)) {
      u = u.add(p);
    }
    mA.add(u);
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
