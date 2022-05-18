package irvine.oeis.a285;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction2;
import irvine.math.Mobius;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a304.A304972;

/**
 * A285037 Irregular triangle read by rows: T(n,k) is the number of primitive (period n) periodic palindromic structures using exactly k different symbols, 1 &lt;= k &lt;= n/2 + 1.
 * @author Sean A. Irvine
 */
public class A285037 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Andrew Howroyd

  private final A304972 mAch = new A304972();
  private int mN = 0;
  private int mM = 1;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      final int m = Mobius.mobius(d);
      if (m != 0) {
        Z s = Stirling.secondKind((n / d + 1) / 2, k).add(Stirling.secondKind(n / d / 2 + 1, k));
        if (((n - d) & 1) == 1) {
          s = s.add(mAch.get((n / d + 1) / 2, k).add(mAch.get(n / d / 2 + 1, k)));
        }
        if ((d & 1) == 1) {
          s = s.divide2();
        }
        sum = sum.signedAdd(m == 1, s);
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN / 2 + 1) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
