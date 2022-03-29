package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034757;

/**
 * A055598 Even numbers not the sum of two terms from A034757.
 * @author Sean A. Irvine
 */
public class A055598 extends A034757 {

  private final TreeSet<Long> mExcluded = new TreeSet<>();
  private long mA = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mA < mN) {
        final Sequence seq = new A034757();
        long t;
        do {
          t = seq.next().longValue();
          mExcluded.add(t + mA);
        } while (t != mA);
        mA = super.next().longValueExact();
      }
      if (!mExcluded.remove(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
