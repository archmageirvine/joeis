package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001016 Eighth powers: a(n) = n^8.
 * @author Sean A. Irvine
 */
public class A001016 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(8);
  }
}
