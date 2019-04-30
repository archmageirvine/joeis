package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000625 Number of n-node steric rooted ternary trees; number of n carbon alkyl radicals <code>C(n)H(2n+1)</code> taking stereoisomers into account.
 * @author Sean A. Irvine
 */
public class A000625 extends A000620 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    super.next();
    return mT.get(mN);
  }
}
