package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019521.
 * @author Sean A. Irvine
 */
public class A019521 implements Sequence {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(Z.valueOf(++mN).square());
    return new Z(mS);
  }
}

