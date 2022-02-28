package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047656 a(n) = 3^((n^2-n)/2).
 * @author Sean A. Irvine
 */
public class A047656 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.THREE.pow((++mN * mN - mN) / 2);
  }
}
