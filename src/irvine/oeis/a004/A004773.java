package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004773.
 * @author Sean A. Irvine
 */
public class A004773 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while ((mN & 3) == 3);
    return Z.valueOf(mN);
  }
}

