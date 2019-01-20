package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017603.
 * @author Sean A. Irvine
 */
public class A017603 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

