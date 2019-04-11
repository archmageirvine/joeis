package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001093 <code>a(n) = n^3 + 1</code>.
 * @author Sean A. Irvine
 */
public class A001093 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(3).add(1);
  }
}

