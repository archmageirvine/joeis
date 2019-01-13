package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015219.
 * @author Sean A. Irvine
 */
public class A015219 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(mN).multiply(mN + 1).multiply(mN + 2).divide(6);
  }
}
