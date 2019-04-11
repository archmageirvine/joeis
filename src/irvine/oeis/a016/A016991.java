package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016991 <code>a(n) = (7*n)^11</code>.
 * @author Sean A. Irvine
 */
public class A016991 implements Sequence {

  private Z mN = Z.valueOf(-7);

  @Override
  public Z next() {
    mN = mN.add(7);
    return mN.pow(11);
  }
}

