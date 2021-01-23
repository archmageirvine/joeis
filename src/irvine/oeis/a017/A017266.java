package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017266 a(n) = (9*n + 8)^10.
 * @author Sean A. Irvine
 */
public class A017266 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(10);
  }
}

