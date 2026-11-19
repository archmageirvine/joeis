package irvine.oeis.a350;

import java.util.List;
import irvine.math.graph.GraphUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;

/**
 * A350734 Triangle read by rows: T(n,k) is the number of weakly connected oriented graphs on n unlabeled nodes with k arcs.
 * @author Gregory Morse
 */
public class A350734 extends A350733 {
  /**
   * Construct with a specified offset.
   * @param offset first index and first vertex count
   */
  protected A350734(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A350734() {
    this(1);
  }

  @Override
  protected Polynomial<Polynomial<Q>> graphCounts(final PolynomialRingField<Q> fld, final List<List<Polynomial<Q>>> data) {
    return PolynomialUtils.inverseEuler(fld, GraphUtils.unlabeledOgf(fld, data));
  }
}
