package irvine.oeis.a001;

import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.util.Pair;

/**
 * A001430 Number of graphs with n nodes and n-2 edges.
 * @author Sean A. Irvine
 */
public class A001430 extends MemoryFunction1Sequence<Polynomial<Q>> {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001430(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001430() {
    super(1);
  }

  // See p. 145 in Riordan "Introduction to Combinatorial Analysis"
  private MultivariateMonomial slepian(final MultivariateMonomial t) {
    final int mm = t.maxIndex();
    final MultivariateMonomial m = new MultivariateMonomial();
    for (final Map.Entry<Pair<String, Integer>, Z> e : t.entrySet()) {
      final int j = e.getKey().right();
      // Handle terms of form a_j^k
      final Z k = e.getValue();
      if ((j & 1) == 0) {
        final int y = j / 2;
        m.add(y, k);
        m.add(j, k.multiply(k).multiply(y).subtract(k));
      } else {
        m.add(j, k.multiply(k).multiply(j).subtract(k).divide2());
      }
      // Handle all other composition terms; i.e. a_j^k o a_i^d
      for (int i = j + 1; i <= mm; ++i) {
        final Z d = t.get(new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, i));
        final int gcd = IntegerUtils.gcd(i, j);
        m.add(i * j / gcd, d.multiply(k).multiply(gcd));
      }
    }
    m.setCoefficient(t.getCoefficient());
    return m;
  }

  private CycleIndex slepian(final int n) {
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    final CycleIndex ans = new CycleIndex("G");
    for (final MultivariateMonomial t : zn.values()) {
      ans.add(slepian(t));
    }
    return ans;
  }

  @Override
  protected Polynomial<Q> compute(final int n) {
    return n == 0 ? null : slepian(n).applyOnePlusXToTheN();
  }

  protected Z numberLinearGraphs(final int nodes, final int edges) {
    if (nodes == 1) {
      return edges == 0 ? Z.ONE : Z.ZERO;
    }
    if (edges < 0) {
      return Z.ZERO;
    }
    return get(nodes).coeff(edges).toZ();
  }

  protected int mN = 0;

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN - 2);
  }

}
