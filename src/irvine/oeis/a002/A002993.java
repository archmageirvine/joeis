package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002993.
 * @author Sean A. Irvine
 */
public class A002993 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(mN.square().toString().charAt(0) - '0');
  }
}
