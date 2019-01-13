package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008972.
 * @author Sean A. Irvine
 */
public class A008972 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int s = mN * mN;
    if (s <= 0) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(s).pow(s);
  }
}

