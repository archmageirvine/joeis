package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001513.
 * @author Sean A. Irvine
 */
public class A001513 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.multiply(mN.add(4));
  }
}
