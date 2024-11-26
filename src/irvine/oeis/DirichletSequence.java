package irvine.oeis;

import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;

/**
 * Sequence backed by a Dirichlet series.
 * @author Sean A. Irvine
 */
public class DirichletSequence extends AbstractSequence implements DirectSequence {

  private final Ds mDs;
  private long mN;

  /**
   * Construct a new sequence backed by a Dirichlet series.
   * @param offset sequence offset
   * @param ds Dirichlet series
   */
  public DirichletSequence(final int offset, final Ds ds) {
    super(offset);
    mDs = ds;
    mN = offset - 1;
  }

  /**
   * Construct a new sequence backed by a Dirichlet series.
   * @param ds Dirichlet series
   */
  public DirichletSequence(final Ds ds) {
    this(1, ds);
  }

  @Override
  public Z a(final Z n) {
    return mDs.coeff(n);
  }

  @Override
  public Z a(final int n) {
    return mDs.coeff(n);
  }

  @Override
  public Z next() {
    return mDs.coeff(++mN);
  }
}
