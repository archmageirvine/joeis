package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017184.
 * @author Sean A. Irvine
 */
public class A017184 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

