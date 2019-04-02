package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017602 (12n+6)^10.
 * @author Sean A. Irvine
 */
public class A017602 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(10);
  }
}

