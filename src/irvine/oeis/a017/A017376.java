package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017376 a(n) = (10*n + 8)^12.
 * @author Sean A. Irvine
 */
public class A017376 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(12);
  }
}

