package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011896.
 * @author Sean A. Irvine
 */
public class A011896 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(14);
  }
}
