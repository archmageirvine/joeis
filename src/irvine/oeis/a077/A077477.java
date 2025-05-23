package irvine.oeis.a077;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077477 Least positive integers not excluded by the rule that if n is present then 2n+1 and 3n+1 are not allowed.
 * @author Sean A. Irvine
 */
public class A077477 extends Sequence1 {

  private final TreeSet<Long> mForbidden = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (mForbidden.remove(++mN)) {
      // do nothing
    }
    mForbidden.add(2 * mN + 1);
    mForbidden.add(3 * mN + 1);
    return Z.valueOf(mN);
  }
}
