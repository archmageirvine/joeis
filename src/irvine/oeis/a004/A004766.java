package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004766.
 * @author Sean A. Irvine
 */
public class A004766 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN;
  }
}

