package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a332.A332785;

/**
 * A392069 Powers k^m divisible by only 1 prime cube, with m &gt; 1 and nonsquarefree weak k (in A332785).
 * @author Sean A. Irvine
 */
public class A392069 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A332785());

  /** Construct the sequence. */
  public A392069() {
    super(1, 1, 2, (k, m) -> S.a(k.intValue()).pow(m));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    final FactorSequence fs = Jaguar.factor(n);
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) > 2 && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
  }
}
