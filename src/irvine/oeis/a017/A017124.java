package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017124 a(n) = (8*n + 4)^12.
 * @author Sean A. Irvine
 */
public class A017124 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(12);
  }
}

