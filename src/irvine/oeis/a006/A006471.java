package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006471 Number of rooted planar maps.
 * @author Sean A. Irvine
 */
public class A006471 implements Sequence {

  // Using conjecture of Colin Barker

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(13)
      .add(242).multiply(mN)
      .add(1770).multiply(mN)
      .add(6400).multiply(mN)
      .add(11777).multiply(mN)
      .add(10158).multiply(mN)
      .add(3240).multiply(mN)
      .multiply(mN + 2).multiply(mN + 2)
      .divide(60480);
  }
}
