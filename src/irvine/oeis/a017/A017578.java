package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017578 (12n+4)^10.
 * @author Sean A. Irvine
 */
public class A017578 implements Sequence {

  private Z mN = Z.valueOf(-8);

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(10);
  }
}

