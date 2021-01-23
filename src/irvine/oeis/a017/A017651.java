package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017651 (12n+10)^11.
 * @author Sean A. Irvine
 */
public class A017651 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

