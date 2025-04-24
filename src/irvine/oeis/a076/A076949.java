package irvine.oeis.a076;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003095;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A076949 Decimal expansion of c, the constant such that lim n -&gt; infinity A003095(n)/c^(2^n) = 1.
 * @author Sean A. Irvine
 */
public class A076949 extends DecimalExpansionSequence {

  private static final MemoryFunction1<CR> S = new MemoryFunction1<>() {
    private final Sequence mA = new A003095().skip(2);
    @Override
    protected CR compute(final int n) {
      if (n <= 1) {
        return CR.LOG2.divide(2);
      }
      return get(n - 1).add(CR.valueOf(Q.ONE.add(new Q(1, mA.next().square()))).log().divide(Z.TWO.pow(n)));
    }
  };

  /** Construct the sequence. */
  public A076949() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z a = S.get(1).getApprox(precision).divide2();
        int k = 1;
        while (true) {
          final Z b = S.get(++k).getApprox(precision).divide2();
          if (a.equals(b)) {
            return a;
          }
          a = b;
        }
      }
    }.exp());
  }
}

