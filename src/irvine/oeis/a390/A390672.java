package irvine.oeis.a390;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390672 allocated for Ralph L. Childress.
 * @author Sean A. Irvine
 */
public class A390672 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<String> mB = new MemoryFunction1<>() {
    @Override
    protected String compute(final int n) {
      if (n == 0) {
        return "";
      }
      if (n == 1) {
        return "10";
      }
      final StringBuilder sb = new StringBuilder();
      for (long p = 2; p <= Functions.GPF.l(n); p = Functions.NEXT_PRIME.l(p)) {
        final int v = Functions.VALUATION.i(n, p);
        sb.append('1').append(get(v)).append('0');
      }
      return sb.toString();
    }
  };

  @Override
  public Z next() {
    return new Z(mB.get(++mN));
  }
}
