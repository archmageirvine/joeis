package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019520.
 * @author Sean A. Irvine
 */
public class A019520 implements Sequence {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mS.append(mN);
    return new Z(mS);
  }
}

