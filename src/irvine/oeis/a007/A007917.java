package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007917 Version 1 of the "previous prime" function: largest prime <code>&lt;=</code> n.
 * @author Sean A. Irvine
 */
public class A007917 implements Sequence {

  private Z mN = Z.ONE;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isPrime()) {
      mP = mN;
    }
    return mP;
  }
}
