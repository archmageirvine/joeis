package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038396 Concatenate first n even numbers in reverse order.
 * @author Sean A. Irvine
 */
public class A038396 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    mS.insert(0, mN);
    return new Z(mS);
  }
}
