package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076105 a(1)=1 (first row) and then the n-th row of this triangle contains the least set of n unused natural numbers whose sum is a multiple of the sum of the previous row.
 * @author Sean A. Irvine
 */
public class A076105 extends Sequence1 {

  private final TreeSet<Z> mUsed = new TreeSet<>(); // keeps used numbers > mS
  protected final List<Z> mA = new ArrayList<>(); // the current row
  private int mK = 0; // position we are in mA during output
  private long mN = 0;
  private Z mS = Z.TWO; // least unused number

  protected void step() {
    mK = 0;
    if (++mN == 1) {
      mA.add(Z.ONE);
      return;
    }
    final Z target = Functions.SUM.z(mA);
    mA.clear();
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

    // Now make sum a multiple of the target
    Z v = sum.add(target.subtract(1)).divide(target).multiply(target).subtract(sum);
    while (true) {
      if (v.compareTo(m) > 0 && mUsed.add(v)) {
        mA.add(v);
        break;
      }
      v = v.add(target);
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
