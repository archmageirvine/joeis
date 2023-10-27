package irvine.oeis.a193;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A193137 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(2 * mN - 4).multiply(Z.valueOf(2 * mN).pow((mN - 1) * (mN - 1)));
  }
}
