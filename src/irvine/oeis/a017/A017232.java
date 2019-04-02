package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017232 a(n) = (9*n + 5)^12.
 * @author Sean A. Irvine
 */
public class A017232 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

