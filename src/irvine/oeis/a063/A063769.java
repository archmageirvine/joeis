package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000396;
import irvine.oeis.a115.A115350;

/**
 * A063769 Aspiring numbers: numbers whose aliquot sequence terminates in a perfect number.
 * @author Sean A. Irvine
 */
public class A063769 extends A115350 {

  private final TreeSet<Z> mPerfect = new TreeSet<>();
  private final Sequence mP = new A000396();
  {
    mPerfect.add(mP.next());
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      while (t.compareTo(mPerfect.last()) > 0) {
        mPerfect.add(mP.next());
      }
      if (!mN.equals(t) && mPerfect.contains(t)) {
        return mN;
      }
    }
  }
}
