package irvine.oeis.a077;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077168 Lexicographically earliest infinite sequence of distinct positive numbers with the property that when written as a triangle, the product of each row is a factorial.
 * @author Sean A. Irvine
 */
public class A077168 extends Sequence0 {

  private final TreeSet<Z> mUsed = new TreeSet<>(); // keeps used numbers > mS
  protected final List<Z> mA = new ArrayList<>(); // the current row
  private int mK = 0; // position we are in mA during output
  private long mN = 0;
  private Z mS = Z.TWO; // least unused number
  protected long mFactorialIndex = 1; // for A077171

  protected void step() {
    mA.clear();
    mK = 0;
    if (++mN <= 1) {
      mA.add(Z.ONE);
      return;
    }
    Z prod = Z.ONE;
    Z m = mS;
    // The first n-1 numbers are simply the smallest not yet used
    for (long k = 0; k < mN - 1; ++k) {
      while (!mUsed.add(m)) {
        m = m.add(1);
      }
      prod = prod.multiply(m);
      mA.add(m);
    }

    mFactorialIndex = 2;
    while (true) {
      final Z f = Functions.FACTORIAL.z(++mFactorialIndex);
      final Z[] qr = f.divideAndRemainder(prod);
      if (qr[1].isZero() && mUsed.add(qr[0])) {
        mA.add(qr[0]);
        break;
      }
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
