package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038395 Concatenation of the first n odd numbers in reverse order.
 * @author Sean A. Irvine
 */
public class A038395 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    mS.insert(0, mN);
    return new Z(mS);
  }
}
