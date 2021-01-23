package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017244 a(n) = (9*n + 6)^12.
 * @author Sean A. Irvine
 */
public class A017244 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

