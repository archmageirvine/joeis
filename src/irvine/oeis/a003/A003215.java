package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003215.
 * @author Sean A. Irvine
 */
public class A003215 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(3).multiply(mN + 1).add(1);
  }
}
