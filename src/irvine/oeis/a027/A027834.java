package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027834 Number of labeled strongly connected <code>n-state 2-input</code> automata.
 * @author Sean A. Irvine
 */
public class A027834 implements Sequence {

  private static final class SFunction extends MemoryFunction2<Integer, Z> {
    
    private final MemoryFunction2<Integer, Z> mV = new MemoryFunction2<Integer, Z>() {
      @Override
      protected Z compute(final Integer r, final Integer n) {
        if (n == 0) {
          return Z.ONE;
        }
        final Z zn = Z.valueOf(n);
        Z sum = zn.pow(r * n);
        for (int t = 1; t < n; ++t) {
          sum = sum.subtract(Binomial.binomial(n, t).multiply(zn.pow(r * (n - t))).multiply(get(r, t)));
        }
        return sum;
      }
    };
    
    @Override
    protected Z compute(final Integer r, final Integer n) {
      Z sum = mV.get(r, n);
      for (int t = 1; t < n; ++t) {
        sum = sum.add(Binomial.binomial(n - 1, t - 1).multiply(mV.get(r, n - t)).multiply(get(r, t)));
      }
      return sum;
    }
  }

  private Integer mN = 0;
  private final SFunction mS = new SFunction();

  protected int getR() {
    return 2;
  }

  @Override
  public Z next() {
    return mS.get(getR(), ++mN);
  }
}
