package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001972.
 * @author Sean A. Irvine
 */
public class A001972 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().shiftRight(3);
  }
}
