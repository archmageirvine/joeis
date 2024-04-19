package irvine.oeis.a342;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A342982 Triangle read by rows: T(n,k) is the number of tree-rooted planar maps with n edges and k+1 faces, n &gt;= 0, k = 0..n.
 * @author Sean A. Irvine
 */
public class A342982 extends AbstractSequence {

  /** Construct the sequence. */
  public A342982() {
    super(0);
  }

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return Functions.FACTORIAL.z(2 * n)
      .divide(Functions.FACTORIAL.z(m))
      .divide(Functions.FACTORIAL.z(m + 1))
      .divide(Functions.FACTORIAL.z(n - m))
      .divide(Functions.FACTORIAL.z(n - m + 1));

  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
