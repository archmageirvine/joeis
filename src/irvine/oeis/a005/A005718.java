package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005718.
 * @author Sean A. Irvine
 */
public class A005718 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.THREE.add(Z.valueOf(mN + 14).multiply(mN).add(71).multiply(mN).add(130).multiply(mN).divide(24));
  }
}

