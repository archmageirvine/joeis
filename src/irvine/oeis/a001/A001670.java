package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001670 k appears k times (k even).
 * @author Sean A. Irvine
 */
public class A001670 extends Sequence1 {

  private long mN = 0;
  private long mC = 1;

  @Override
  public Z next() {
    if (--mC == 0) {
      mN += 2;
      mC = mN;
    }
    return Z.valueOf(mN);
  }
}
