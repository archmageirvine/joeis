package irvine.oeis.a063;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A063841 Table T(n,k) giving number of k-multigraphs on n nodes (n &gt;= 1, k &gt;= 0) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A063841 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A063841(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A063841() {
    super(1);
  }

  protected Z t(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    final CycleIndex zn = SymmetricGroup.create(n).cycleIndex();
    final CycleIndex pair = zn.op(PairMultiply.OP, zn);
    return pair.eval(k + 1).toZ();
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN;
      ++mN;
    }
    return t(mN - mM, mM);
  }
}

