package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017016 <code>a(n) = (7*n + 2)^12</code>.
 * @author Sean A. Irvine
 */
public class A017016 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(12);
  }
}

