package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015238.
 * @author Sean A. Irvine
 */
public class A015238 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 3).multiply(mN).multiply(mN);
  }
}
