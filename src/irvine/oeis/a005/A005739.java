package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005739 Number of disjunctively-realizable functions of n variables.
 * @author Sean A. Irvine
 */
public class A005739 extends A005738 {

  private Z mA = super.next();
  private int mN = -1;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mTerms.get(++mN));
  }

}

