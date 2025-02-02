package irvine.oeis.a074;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a066.A066417;

/**
 * A074897 Possible values for sum of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A074897 extends A066417 {

  private final HashSet<Z> mDone = new HashSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mMin = Z.NEG_ONE;
  private long mN = 0;

  private void step() {
    final Z t = super.next();
    if (t.compareTo(mMin) > 0) {
      mA.add(t);
    } else if (mDone.add(t)) {
      throw new RuntimeException(t + " is a member should have been output earlier");
    }
  }

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      step();
    }
    mMin = mA.pollFirst();
    mDone.add(mMin);
    return mMin;
  }
}
