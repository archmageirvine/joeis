package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019519 Concatenate odd numbers.
 * @author Sean A. Irvine
 */
public class A019519 implements Sequence {

  private long mN = -1;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mS.append(mN);
    return new Z(mS);
  }
}

