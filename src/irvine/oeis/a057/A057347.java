package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057347.
 * @author Sean A. Irvine
 */
public class A057347 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(30);
    return mN.divide(11);
  }
}
