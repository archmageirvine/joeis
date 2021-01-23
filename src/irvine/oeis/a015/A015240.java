package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015240 a(n) = (2*n - 5)n^2.
 * @author Sean A. Irvine
 */
public class A015240 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 5).multiply(mN).multiply(mN);
  }
}
