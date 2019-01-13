package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004642.
 * @author Sean A. Irvine
 */
public class A004642 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return new Z(mN.toString(3));
  }
}

