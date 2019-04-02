package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017015 a(n) = (7*n + 2)^11.
 * @author Sean A. Irvine
 */
public class A017015 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

