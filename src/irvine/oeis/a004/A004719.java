package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004719 Delete all <code>0</code>'s from n.
 * @author Sean A. Irvine
 */
public class A004719 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.toString().replace("0", ""));
  }
}

