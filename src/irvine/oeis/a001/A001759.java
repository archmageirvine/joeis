package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001759 Number of permutations of <code>[n]</code> with <code>n-3</code> sequences.
 * @author Sean A. Irvine
 */
public class A001759 extends A001758 {

  private Z mR;

  {
    super.next();
    super.next();
    mR = mT;
  }

  private int mN = 3;
  private Z mB = super.next();

  @Override
  public Z next() {
    ++mN;
    final Z q = mT;
    final Z t = super.next();
    final Z r = t.divide(2).subtract(mB).subtract(mR.multiply(mN - 1).divide(2));
    mR = q;
    mB = t;
    return r;
  }
}
