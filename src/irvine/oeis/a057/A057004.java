package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.a160.A160449;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A057004 Array T(n,k) = number of conjugacy classes of subgroups of index k in free group of rank n, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A057004 extends A160449 {

  /** Construct the sequence. */
  public A057004() {
    super(1);
  }

  private int mN = 2;
  private int mM = 1;

  @Override
  protected Z t(final int n, final int k) {
    final FiniteSequence seq = new FiniteSequence();
    for (int j = 1; j < n; ++j) {
      seq.add(super.t(j, k));
    }
    final InverseEulerTransform iet = new InverseEulerTransform(seq);
    for (int j = 2; j < n; ++j) {
      iet.next();
    }
    return iet.next();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 2;
    }
    return t(mM, mN - mM);
  }
}
