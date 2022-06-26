package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057727 3^(2^n) + 2.
 * @author Sean A. Irvine
 */
public class A057727 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.THREE.pow(1L << ++mN).add(2);
  }
}
