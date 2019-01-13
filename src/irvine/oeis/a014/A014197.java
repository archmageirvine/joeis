package irvine.oeis.a014;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014197.
 * @author Sean A. Irvine
 */
public class A014197 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(Euler.inversePhi(mN).size());
  }
}
