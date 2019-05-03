package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001823 Central factorial numbers: column 2 in triangle <code>A008956</code>.
 * @author Sean A. Irvine
 */
public class A001823 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN)
      .multiply(mN - 1)
      .multiply(2 * mN + 1)
      .multiply(2 * mN - 1)
      .multiply(2 * mN - 3)
      .multiply(10 * mN + 7)
      .divide(90);
  }
}
