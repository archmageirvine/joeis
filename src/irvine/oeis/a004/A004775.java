package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004775 Numbers k such that the binary expansion of k does not end in 011.
 * @author Sean A. Irvine
 */
public class A004775 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 7) == 3 && mN != 3);
    return Z.valueOf(mN);
  }
}

