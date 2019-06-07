package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006893 Smallest number whose representation requires n triangular numbers with greedy algorithm; also number of 1-2 rooted trees of height <code>n</code>.
 * @author Sean A. Irvine
 */
public class A006893 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(3).multiply(mA).divide2();
    return mA;
  }
}
