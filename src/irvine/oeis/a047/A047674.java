package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047674 Row 5 of square array defined in A047671.
 * @author Sean A. Irvine
 */
public class A047674 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2L * ++mN).subtract(5).multiply(mN).add(20).multiply(mN).subtract(25).multiply(mN).add(23).multiply(mN).subtract(10).divide(5);
  }
}
