package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017316.
 * @author Sean A. Irvine
 */
public class A017316 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

