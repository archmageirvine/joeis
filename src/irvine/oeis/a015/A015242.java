package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015242 a(n) = (2*n - 7)*n^2.
 * @author Sean A. Irvine
 */
public class A015242 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 7).multiply(mN).multiply(mN);
  }
}
