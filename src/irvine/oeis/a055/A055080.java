package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005747;

/**
 * A055080 Triangle T(n,k) read by rows, giving number of k-member minimal covers of an unlabeled n-set, k=1..n.
 * @author Sean A. Irvine
 */
public class A055080 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return A005747.covers(mN - mM, mM);
  }
}
