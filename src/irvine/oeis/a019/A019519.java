package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019519 Concatenate odd numbers.
 * @author Sean A. Irvine
 */
public class A019519 extends Sequence1 {

  private long mN = -1;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mS.append(mN);
    return new Z(mS);
  }
}

