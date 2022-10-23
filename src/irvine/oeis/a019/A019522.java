package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019522 Concatenate cubes.
 * @author Sean A. Irvine
 */
public class A019522 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(Z.valueOf(++mN).pow(3));
    return new Z(mS);
  }
}

