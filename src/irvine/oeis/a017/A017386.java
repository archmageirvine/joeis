package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017386.
 * @author Sean A. Irvine
 */
public class A017386 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(10);
  }
}

