package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs;
import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A350490 Number of unlabeled acyclic digraphs with n arcs and a global source.
 * @author Gregory Morse
 */
public class A350490 extends Sequence0 {
  private final Kind mKind;
  private int mDegree = 1;
  private UnlabeledAcyclicDigraphs mDags = new UnlabeledAcyclicDigraphs(mDegree);
  private int mN = -1;

  /**
   * Construct a sequence of totals by number of arcs.
   * @param kind digraph class
   */
  protected A350490(final Kind kind) {
    mKind = kind;
  }

  /** Construct the sequence. */
  public A350490() {
    this(Kind.SOURCE);
  }

  @Override
  public Z next() {
    if (++mN > mDegree) {
      mDegree = 2 * mN - 1;
      mDags = new UnlabeledAcyclicDigraphs(mDegree);
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN + 1; ++k) {
      if ((long) k * (k - 1) / 2 >= mN) {
        sum = sum.add(mDags.row(k, mKind).coeff(mN).toZ());
      }
    }
    return sum;
  }
}
