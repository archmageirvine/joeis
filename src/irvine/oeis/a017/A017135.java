package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017135 a(n) = (8*n + 5)^11.
 * @author Sean A. Irvine
 */
public class A017135 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN.pow(11);
  }
}

