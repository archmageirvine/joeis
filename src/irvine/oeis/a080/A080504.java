package irvine.oeis.a080;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080504 Triangle whose n-th row contains the least set (ordered lexicographically) of n distinct positive integers whose arithmetic and geometric means are both integers.
 * @author Sean A. Irvine
 */
public class A080504 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected Z[] mRow = null;

  private Z minMultiplicativeComponent(final Z m) {
    final FactorSequence fs = Jaguar.factor(m);
    Z min = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      min = min.multiply(p.pow((mN - e % mN) % mN));
    }
    return min;
  }

  protected void step() {
    if (++mN == 1) {
      mRow = new Z[] {Z.ONE};
      return;
    }
    mRow = new Z[mN];
    Z sum = Z.ZERO;
    Z prod = Z.ONE;
    for (int k = 1; k <= mN - 2; ++k) {
      mRow[k - 1] = Z.valueOf(k);
      sum = sum.add(k);
      prod = prod.multiply(k);
    }
    // It remains to compute last two elements
    int j = mN - 2;
    while (true) {
      ++j;
      // try j as second to last element
      final Z sumj = sum.add(j);
      final Z mc = minMultiplicativeComponent(prod.multiply(j));
      long i = 0;
      final HashSet<Long> seenResidues = new HashSet<>();
      while (true) {
        final Z t = mc.multiply(Z.valueOf(++i).pow(mN));
        final long r = sumj.add(t).mod(mN);
        if (t.compareTo(j) > 0 && r == 0) {
          // Found the solution
          mRow[mN - 2] = Z.valueOf(j);
          mRow[mN - 1] = t;
          return;
        }
        if (!seenResidues.add(r)) {
          break;
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      step();
      //System.out.println("Row is: " + Arrays.toString(mRow));
    }
    return mRow[mM];
  }
}

