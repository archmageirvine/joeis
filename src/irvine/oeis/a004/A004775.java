package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004775 Numbers n such that the binary expansion of n does not end 011.
 * @author Sean A. Irvine
 */
public class A004775 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 7) == 3 && mN != 3);
    return Z.valueOf(mN);
  }
}

