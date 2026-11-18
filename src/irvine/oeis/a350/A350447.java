package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs;
import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A350447 Triangle read by rows: T(n,k) is the number of acyclic digraphs on n unlabeled nodes with k arcs, n &gt;= 0, k = 0..(n-1)*n/2.
 * @author Gregory Morse
 */
public class A350447 extends AbstractSequence {
  private final UnlabeledAcyclicDigraphs mDags = new UnlabeledAcyclicDigraphs(true);
  private final Kind mKind;
  private int mN;
  private int mM = -1;

  /**
   * Construct an arc enumerator for a digraph class.
   * @param offset first index
   * @param kind digraph class
   */
  protected A350447(final int offset, final Kind kind) {
    super(offset);
    mN = offset;
    mKind = kind;
  }

  /** Construct the sequence. */
  public A350447() {
    this(0, Kind.ALL);
  }

  @Override
  public Z next() {
    Polynomial<Q> row = mDags.row(mN, mKind);
    if (++mM > row.degree()) {
      row = mDags.row(++mN, mKind);
      mM = 0;
    }
    return row.coeff(mM).toZ();
  }
}
