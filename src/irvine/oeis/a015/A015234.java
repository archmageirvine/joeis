package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015234.
 * @author Sean A. Irvine
 */
public class A015234 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(17 - 2 * ++mN).multiply(mN).multiply(mN);
  }
}
