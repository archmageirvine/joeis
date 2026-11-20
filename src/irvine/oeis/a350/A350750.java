package irvine.oeis.a350;

import java.util.List;
import irvine.math.graph.GraphUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

/**
 * A350750 Triangle read by rows: T(n,k) is the number of strongly connected oriented graphs on n unlabeled nodes with k arcs, n &gt;= 1, k = 0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350750 extends A350733 {
  /**
   * Construct with a specified offset.
   * @param offset first index and first vertex count
   */
  protected A350750(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A350750() {
    this(1);
  }

  @Override
  protected Polynomial<Polynomial<Q>> graphCounts(final PolynomialRingField<Q> fld, final List<List<Polynomial<Q>>> data) {
    return GraphUtils.strong(fld, data, fld::onePlusXToTheN);
  }
}
