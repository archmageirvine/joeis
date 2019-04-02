package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000596 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A000596 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN)
      .multiply(mN - 1)
      .multiply(mN - 2)
      .multiply(2 * mN - 1)
      .multiply(2 * mN - 3)
      .multiply(5 * mN + 1)
      .divide(360);
  }
}
