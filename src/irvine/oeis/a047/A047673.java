package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047673 Row 4 of square array defined in A047671.
 * @author Sean A. Irvine
 */
public class A047673 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(2).multiply(mN).add(5).multiply(mN).subtract(4).multiply(mN).add(1);
  }
}
