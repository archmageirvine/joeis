package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027903 n * (n + 1) * (3*n + 1).
 * @author Sean A. Irvine
 */
public class A027903 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(3 * mN + 1);
  }
}
