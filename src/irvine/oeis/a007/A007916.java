package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007916 Numbers that are not perfect powers.
 * @author Sean A. Irvine
 */
public class A007916 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.isPower() != null);
    return mN;
  }
}
