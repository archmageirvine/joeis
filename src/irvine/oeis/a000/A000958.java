package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000958 Number of ordered rooted trees with n edges having root of odd degree.
 * @author Sean A. Irvine
 */
public class A000958 extends A000957 {

  {
    super.next();
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
