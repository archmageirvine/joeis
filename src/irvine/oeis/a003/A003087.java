package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.MultivariateMonomialOperation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A003087 Number of acyclic digraphs with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A003087 extends Sequence0 {

  // See pp. 191-194, Graphical Enumeration by Harary and Palmer

  private static final class A003087Operation implements MultivariateMonomialOperation {
    @Override
    public MultivariateMonomial op(final MultivariateMonomial alpha, final MultivariateMonomial beta) {
      // alpha is prod s_k^{i_k}
      // beta is prod s_j^{j_k}t_k^m
      // phi part
      final MultivariateMonomial res = new MultivariateMonomial();
      final int kMax = Math.max(alpha.maxIndex(), beta.maxIndex());
      for (int k = 1; k <= kMax; ++k) {
        final Pair<String, Integer> key = new Pair<>("s", k);
        final Z jk = beta.get(key);
        final Z mk = beta.get(new Pair<>("t", k));
        res.add("s", k, alpha.get(key));
        res.add("t", k, jk.add(mk));
      }
      // j_1(alpha, beta)' part
      Z prod = Z.ONE;
      int shift = 0;
      for (int r = 1; r <= kMax; ++r) {
        final int mr = beta.get(new Pair<>("t", r)).intValueExact();
        int s = 0;
        for (final Map.Entry<Pair<String, Integer>, Z> e : alpha.entrySet()) {
          final Pair<String, Integer> kKey = e.getKey();
          final int k = kKey.right();
          final int d = e.getValue().multiply(IntegerUtils.gcd(k, r)).intValueExact();
          s += d;
          shift += d * mr;
        }
        final int jr = beta.get(new Pair<>("s", r)).intValueExact();
        final Z t = Z.ONE.shiftLeft(s).subtract(1).pow(jr);
        prod = prod.multiply(t);
      }
      prod = prod.shiftLeft(shift);
      res.setCoefficient(alpha.getCoefficient().multiply(beta.getCoefficient()));
      res.multiply(prod);
      return res;
    }
  }

  private static final A003087Operation OP = new A003087Operation();

  private final ArrayList<CycleIndex> mH = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      final MultivariateMonomial h0a = new MultivariateMonomial();
      mH.add(new CycleIndex("Z(H_0)", h0a));
    } else {
      final CycleIndex hn = new CycleIndex("Z(H_" + mN + ")");
      for (int k = 1; k <= mN; ++k) {
        final CycleIndex t = SymmetricGroup.create(k).cycleIndex().relabel(MultivariateMonomial.DEFAULT_VARIABLE, "s").op(OP, mH.get(mN - k));
        hn.add(t);
      }
      mH.add(hn);
    }
    Q s = Q.ZERO;
    for (final MultivariateMonomial m : mH.get(mH.size() - 1).values()) {
      s = s.add(m.getCoefficient());
    }
    return s.toZ();
  }
}
