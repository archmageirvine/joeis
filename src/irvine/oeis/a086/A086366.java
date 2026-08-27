package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.z.Z;
import irvine.oeis.gf.EgfSequence;

/**
 * A086366 Number of labeled n-node digraphs in which every node belongs to a directed cycle.
 * @author Sean A. Irvine
 */
public class A086366 extends EgfSequence {

  // After Andrew Howroyd

  private static final Series<Q> DIGRAPH_EGF = new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final long n) {
      return new Q(Z.ONE.shiftLeft(n * (n - 1)), Functions.FACTORIAL.z(n));
    }
  };
  private static final Series<Q> G = new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final long n) {
      return new Q(Z.ONE, Z.ONE.shiftLeft(n * (n - 1) / 2));
    }
  };
  private static final Series<Q> U = new AbstractInfiniteSeries<>() {
    @Override
    public Q coeff(final long n) {
      return new Q(Z.ONE.shiftLeft(n * (n - 1) / 2));
    }
  };

  /** Construct the sequence. */
  public A086366() {
    super(0, SQ.hadamardMultiply(SQ.divide(SQ.one(), SQ.hadamardMultiply(RationalSeriesEnum.EXP.s(SQ.add(RationalSeriesEnum.LOG1P.s(SQ.subtract(SQ.hadamardMultiply(SQ.divide(SQ.one(), SQ.hadamardMultiply(DIGRAPH_EGF, G)), U), SQ.one())), SQ.x())), G)), U));
  }
}

