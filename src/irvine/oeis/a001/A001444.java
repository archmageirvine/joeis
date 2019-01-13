package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001444.
 * @author Sean A. Irvine
 */
public class A001444 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.pow(mN).add(Z.THREE.pow(mN / 2)).divide(2);
  }
}
