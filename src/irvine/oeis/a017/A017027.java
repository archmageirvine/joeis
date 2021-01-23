package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017027 a(n) = (7*n + 3)^11.
 * @author Sean A. Irvine
 */
public class A017027 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

