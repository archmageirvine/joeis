package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005741.
 * @author Sean A. Irvine
 */
public class A005741 extends A005740 {

  private Z mA = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mTerms.get(++mN));
  }

}

