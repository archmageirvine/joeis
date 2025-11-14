package irvine.oeis.a081;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A081846 Maximal element in the continued fraction for 1/n*sum(k&gt;=0,1/2^(2^k)).
 * @author Sean A. Irvine
 */
public class A081846 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_SUM_TERMS = 16;
  private long mN = 0;
  private final Q mQ = constant(HEURISTIC_SUM_TERMS);

  private static Q constant(final int k) {
    Q sum = Q.ZERO;
    for (int j = 0; j < k; ++j) {
      sum = sum.add(new Q(Z.ONE, Z.ONE.shiftLeft(1L << j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    final Q v = mQ.divide(++mN);
    final List<Z> cf = ContinuedFractionUtils.continuedFraction(v);
    //System.out.println(cf);
    return Functions.MAX.z(cf);
  }
}

