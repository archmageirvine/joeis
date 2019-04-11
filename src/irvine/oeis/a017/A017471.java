package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017471 <code>a(n) = (11*n + 6)^11</code>.
 * @author Sean A. Irvine
 */
public class A017471 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(11);
    return mN.pow(11);
  }
}

