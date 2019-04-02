package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017556 (12n+2)^12.
 * @author Sean A. Irvine
 */
public class A017556 implements Sequence {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(12);
  }
}

