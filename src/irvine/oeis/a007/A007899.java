package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007899 Coordination sequence for hexagonal close-packing.
 * @author Sean A. Irvine
 */
public class A007899 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).square().multiply(21).divide2().add(2);
  }
}
