package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011929.
 * @author Sean A. Irvine
 */
public class A011929 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(mN - 2).multiply(++mN).divide(19);
  }
}
