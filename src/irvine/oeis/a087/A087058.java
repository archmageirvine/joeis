package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087058 Smallest square number greater than 2*n^2.
 * @author Sean A. Irvine
 */
public class A087058 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.SQRT.z(2 * ++mN * mN).add(1).square();
  }
}
