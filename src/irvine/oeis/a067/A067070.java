package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A067037.
 * @author Sean A. Irvine
 */
public class A067070 extends Sequence1 {

  private final Sequence mCubes = new A000578();

  @Override
  public Z next() {
    while (true) {
      final Z c = mCubes.next();
      final Z p = ZUtils.digitProduct(c);
      if (p.signum() > 0 && ZUtils.isCube(p)) {
        return c;
      }
    }
  }
}
