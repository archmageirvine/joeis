package irvine.oeis.a003;

import java.util.HashMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003015.
 * @author Sean A. Irvine
 */
public class A003015 implements Sequence {

  // First implementation finds only "Fibonacci" solutions, not every solution

//  private Z mA = Z.ZERO;
//  private Z mB = Z.ONE;
//  private Z mC = Z.ONE;
//
//
//  @Override
//  public Z next() {
//    while (true) {
//      final Z n = mB.multiply(mC);
//      final Z m = mA.multiply(mB);
//      final Z b = Binomial.binomial(n, m.subtract(1));
//      mA = mB;
//      mB = mC;
//      mC = mA.add(mB);
//      System.out.println("c=" + mC);
//      if (b.equals(Binomial.binomial(n.subtract(1), m))) {
//        return b;
//      }
//    }
//  }

  // This implementation is slow

  private Z[] mPascal = {Z.ONE};
  private final HashMap<Z, Long> mCount = new HashMap<>();
  {
    mCount.put(Z.ONE, 1L);
  }
  private final TreeSet<Z> mPriority = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      if (!mPriority.isEmpty() && mPriority.first().intValueExact() < mPascal.length) {
        return mPriority.pollFirst();
      }
      final Z[] row = new Z[mPascal.length + 1];
      Z p = Z.ZERO;
      for (int k = 0; k < row.length; ++k) {
        final Z q = k < mPascal.length ? mPascal[k] : Z.ZERO;
        row[k] = p.add(q);
        p = q;
      }
      for (final Z t : row) {
        final Long c = mCount.get(t);
        if (c == null) {
          mCount.put(t, 1L);
        } else {
          if (c == 4) {
            mPriority.add(t);
          }
          mCount.put(t, c + 1);
        }
      }
      mPascal = row;
    }
  }
}
