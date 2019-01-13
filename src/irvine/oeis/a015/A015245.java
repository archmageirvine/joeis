package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015245.
 * @author Sean A. Irvine
 */
public class A015245 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 11).multiply(mN).multiply(mN);
  }
}
