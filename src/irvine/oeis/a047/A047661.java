package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047661 Row 5 of square array defined in A047662.
 * @author Sean A. Irvine
 */
public class A047661 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2L * ++mN).add(5).multiply(mN).add(20).multiply(mN).add(25).multiply(mN).add(23).multiply(mN).divide(15);
  }
}
