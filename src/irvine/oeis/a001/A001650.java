package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001650.
 * @author Sean A. Irvine
 */
public class A001650 implements Sequence {

  private long mN = -1;
  private long mC = 0;

  @Override
  public Z next() {
    if (--mC <= 0) {
      mN += 2;
      mC = mN;
    }
    return Z.valueOf(mN);
  }
}
