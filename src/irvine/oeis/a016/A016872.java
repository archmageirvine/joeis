package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016872 <code>(5n+1)^12</code>.
 * @author Sean A. Irvine
 */
public class A016872 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.pow(12);
  }
}

