package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030123.
 * @author Sean A. Irvine
 */
public class A030123 implements Sequence {

  private long mN = -7;

  @Override
  public Z next() {
    mN += 7;
    if (mN <= 7) {
      return Z.valueOf(mN / 7);
    }
    return Z.valueOf(mN / 2);
  }
}

