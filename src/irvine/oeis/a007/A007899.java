package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007899.
 * @author Sean A. Irvine
 */
public class A007899 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).square().multiply(21).divide2().add(2);
  }
}
