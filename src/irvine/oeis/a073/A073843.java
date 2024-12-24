package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073843 a(1) = 1; for n &gt; 1 a(n) = smallest number of the form n^r (with r rational != 1) not included earlier.
 * @author Sean A. Irvine
 */
public class A073843 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    int g = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      g = g == 0 ? e : Functions.GCD.i(g, e);
    }
    return Z.valueOf(mN).pow(g + ((g & 1) == 0 ? -1 : 1)).root(g);
  }
}
