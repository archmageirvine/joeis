package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017483.
 * @author Sean A. Irvine
 */
public class A017483 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

