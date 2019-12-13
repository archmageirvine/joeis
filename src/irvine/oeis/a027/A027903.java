package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027903 <code>n * (n + 1) * (3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A027903 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(3 * mN + 1);
  }
}
