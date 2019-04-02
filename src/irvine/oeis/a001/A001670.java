package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001670 n appears n times (n even).
 * @author Sean A. Irvine
 */
public class A001670 implements Sequence {

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
