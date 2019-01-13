package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007587.
 * @author Sean A. Irvine
 */
public class A007587 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(10 * mN - 17).divide(6);
  }
}
