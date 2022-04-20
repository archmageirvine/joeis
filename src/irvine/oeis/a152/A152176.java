package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a304.A304972;

/**
 * A152176 Triangle read by rows: T(n,k) is the number of k-block partitions of an n-set up to rotations and reflections.
 * @author Sean A. Irvine
 */
public class A152176 implements Sequence {

  private final A304972 mA = new A304972();
  private final A152175 mB = new A152175();
  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int k) {
    return mA.get(n, k).add(mB.t(n, k)).divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
