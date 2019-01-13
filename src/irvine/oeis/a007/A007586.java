package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007586.
 * @author Sean A. Irvine
 */
public class A007586 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(3 * mN - 5).divide2();
  }
}
