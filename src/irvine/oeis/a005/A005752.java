package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005752.
 * @author Sean A. Irvine
 */
public class A005752 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final CR n = CR.valueOf(mN);
    final Z floor = CR.PHI.multiply(n).floor(32);
    return Z.valueOf(mN).square().add(floor.multiply(mN)).subtract(floor.square());
  }
}
