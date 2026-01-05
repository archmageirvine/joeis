package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392068 allocated for Michel Lagneau.
 * @author Sean A. Irvine
 */
public class A392068 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    final Z np = p.multiply(++mN);
    return np.pow(p).subtract(1).divide(np.subtract(1));
  }
}
