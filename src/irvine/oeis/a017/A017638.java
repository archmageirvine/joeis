package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017638 (12n+9)^10.
 * @author Sean A. Irvine
 */
public class A017638 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(10);
  }
}

