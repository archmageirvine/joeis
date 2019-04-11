package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002488 <code>a(n) = n^(n^n)</code>.
 * @author Sean A. Irvine
 */
public class A002488 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(mN.pow(mN.intValueExact()).intValueExact());
  }
}
