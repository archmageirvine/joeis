package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390774 Numbers whose final digit is at most 3.
 * @author Sean A. Irvine
 */
public class A390774 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN % 10 == 4) {
      mN += 6;
    }
    return Z.valueOf(mN);
  }
}
