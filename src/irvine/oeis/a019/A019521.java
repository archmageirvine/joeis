package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019521 Concatenate squares.
 * @author Sean A. Irvine
 */
public class A019521 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(Z.valueOf(++mN).square());
    return new Z(mS);
  }
}

