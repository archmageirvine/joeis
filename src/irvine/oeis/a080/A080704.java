package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080704 a(1)=2; for n&gt;1, if n is in the sequence then a(n) is the smallest even integer &gt; a(n-1), otherwise a(n) = a(n-1) + 3.
 * @author Sean A. Irvine
 */
public class A080704 extends Sequence1 {

  private final HashSet<Long> mSet = new HashSet<>();
  private long mA = 2;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if (mSet.contains(mN)) {
        mA += 2;
        mA &= ~1; // make even
      } else {
        mA += 3;
      }
    }
    mSet.add(mA);
    return Z.valueOf(mA);
  }
}
