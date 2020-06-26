package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032781.
 * @author Sean A. Irvine
 */
public class A032781 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN)
      .multiply(mN + 1)
      .multiply(mN + 2)
      .multiply(mN + 3)
      .multiply(mN + 4)
      .multiply(mN + 5)
      .multiply(mN + 6)
      .multiply(mN + 7)
      .multiply(mN + 8)
      .multiply(mN + 9)
      .divide(10 * mN + 45);
  }
}
