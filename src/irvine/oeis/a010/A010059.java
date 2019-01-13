package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010059.
 * @author Sean A. Irvine
 */
public class A010059 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return ((mN.bitCount() & 1) == 0) ? Z.ONE : Z.ZERO;
  }
}

