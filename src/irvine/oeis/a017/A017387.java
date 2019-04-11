package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017387 <code>a(n) = (10*n + 9)^11</code>.
 * @author Sean A. Irvine
 */
public class A017387 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(10);
    return mN.pow(11);
  }
}

