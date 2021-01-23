package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017350 a(n) = (10*n + 6)^10.
 * @author Sean A. Irvine
 */
public class A017350 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(10);
  }
}

