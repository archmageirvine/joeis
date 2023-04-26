package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A063425 Unattainable numbers: integers not expressible as k + product of nonzero digits of k (A063114).
 * @author Sean A. Irvine
 */
public class A063425 extends A063114 {

  private final TreeSet<Z> mExcluded = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mExcluded.add(super.next());
      if (!mExcluded.remove(mN)) {
        return mN;
      }
    }
  }
}
