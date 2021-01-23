package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004526 Nonnegative integers repeated, floor(n/2).
 * @author Sean A. Irvine
 */
public class A004526 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide2();
  }
}
