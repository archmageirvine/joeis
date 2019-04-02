package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005743 Number of fanout-free Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005743 extends A005742 {

  private Z mA = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mTerms.get(++mN));
  }

}

